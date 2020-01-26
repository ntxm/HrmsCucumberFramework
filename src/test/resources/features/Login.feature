Feature: Login

Scenario: Valid login

Given I open browser and navigated to the HRMS
When I enter valid username and valid password 
And I click on the login button
Then I successfully logged in
And Close the browser

Scenario: Negative login

Given I open browser and navigated to the HRMS
When I enter valid username and invalid password
And I click on the login button
Then I have an error message
And Close the browser
