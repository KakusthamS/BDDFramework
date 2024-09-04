Feature: Login page automation of saucedemo App
Scenario: Check login is successfull with valid creds
//adding comments here
Given user is on login page
When user enters valid username and password
And clicks on login button
Then user is navigated to homepage
And close the browser