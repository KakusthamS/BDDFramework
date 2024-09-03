package StepDefinitions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("unused")
public class LoginStepsDefinition {
	static WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.saucedemo.com/v1/");
	}
//THISIS TO LOGIN THE PAGW WITH DETAILS GIVEN
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	//THIS IS TO CLICK THE LGON BUTTON0
	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	   Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"user is navigated to homepage");
	}

	@And("close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}
