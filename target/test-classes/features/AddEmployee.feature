Feature: Add Employee

Scenario:
Given I open browser and navigated to the HRMS
And I enter valid username and valid password
And I click on the login button
When I navigate to Add Employee Page
And I add new employee
Then I verify if employee successfylly created
And Close the browser
