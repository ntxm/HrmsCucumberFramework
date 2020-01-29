@sprint2, @addEmployee
Feature: Add Employee

  Background: 
    Given I open browser and navigated to the HRMS
    And I logged in into HRMS
    And I navigate to Add Employee Page

  @"regression"
  Scenario: Add new employee
    When I add new employee with "Aeron", "Low" and "Baeron"
    And I ckick Save
    Then I verify if employee successfylly created

  @"regression"
  Scenario Outline: Add new employee
    When I add new employee with "<firstName>", "<middleName>" and "<lastName>"
    And I ckick Save
    Then I see Employee with "<firstName>", "<middleName>" and "<lastName>"

    Examples: 
      | firstName | middleName | lastName |
      | Marsha    | Low        | Green    |
      | Marsha    | Low        | Red      |
      | Marsha    | Low        | Orange   |
      | Marsha    | Low        | Pink     |
      | Marsha    | Low        | Purple   |
