@sprint1,addEmployee
Feature: Add Employee

Background: Comes from LoginSteps.java

Given I open browser and navigated to the HRMS
And I enter valid username and valid password
And I click on the login button

@"regression"
Scenario:

Given I navigate to Add Employee Page
When I add new employee
Then I verify if employee successfylly created
And Close the browser


# @"regression"
# Scenario Outline:
# Given I navigate to Add Employee Page
# When I add new employee with <firstName> <middleName> <lastName>
# Then I verify if employee successfylly created
# And Close the browser

#Examples: 
#       | firstName  | middleName | lastName  |
#       | Marsha 		 |     Low 		| Green 		|
#       | Marsha 	   |     Low 		| Red   	  |
#       | Marsha 	   |     Low 		| Orange   	|
#       | Marsha 	   |     Low 		| Pink    	|
#       | Marsha 	   |     Low 		| Purple   	|
