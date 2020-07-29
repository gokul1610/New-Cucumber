Feature: To validate the login functionality of my FB application

Background: 
Given user has to be in Facebook login page

@Regression
Scenario: To verify the login with valid username and valid password.
When user has to fill the Valid username and Valid password
|username|password|
|cgokul|1234|
|papa|0711|
And user needs to click the login button
Then user has to navigate to homepage

@Sanity
Scenario: To verify the login with invalid username and invalid password.
When user has to fill the Invalid username and Invalid password
Then user must not navigate to Homepage

