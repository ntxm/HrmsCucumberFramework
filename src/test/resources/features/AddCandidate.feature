@sprint3 @recruitment
Feature: Recruitment. Add Candidates and Vacancies

  Background: Comes from LoginSteps.java
    Given I open browser and navigated to the HRMS
    And I enter valid username and valid password
    And I click on the login button

@"regression"
  Scenario: 
    Given navigate to add candidate page
    When I provide information about candidate
    And Choose date of application
    And I click Save button
    Then I should see candidate at the table
    And Close the browser
