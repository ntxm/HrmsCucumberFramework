@sprint1,addEmployee
Feature: Add Employee

Background: 

Given I open browser and navigated to the HRMS
And I enter valid username and valid password
And I click on the login button

@"regression"
Scenario:

Given I navigate to Add Employee Page
When I add new employee
Then I verify if employee successfylly created
And Close the browser
