@sprint3 @recruitment
Feature: Recruitment. Add Candidates and Vacancies

  Background: 
    Given I logged in into HRMS
    And navigate to add candidate page

  @smoke
  Scenario: Create new Candidate
    When I provide information about candidate
    And Choose date of application
    And I click Save button
    Then I should see candidate at the table
