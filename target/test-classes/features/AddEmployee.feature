@sprint2, @addEmployee
Feature: Add Employee

  Background: 
    Given I logged in into HRMS
    And I navigate to Add Employee Page


  Scenario: Add new employee
    When I add new employee with "Aeron", "Low" and "Baeron"
    And I ckick Save
    Then I verify if employee successfylly created


  Scenario Outline: Add new employee
    When I add new employee with "<firstName>", "<middleName>" and "<lastName>"
    And I ckick Save
    Then I verify if employee successfylly created

    Examples: 
      | firstName | middleName | lastName |
      | Marsha    | Low        | Green    |
      | Marsha    | Low        | Red      |
      | Marsha    | Low        | Orange   |
      | Marsha    | Low        | Pink     |
      | Marsha    | Low        | Purple   |
