@sprint2, @addEmployee
Feature: Add Employee

  Background: 
    Given I logged in into HRMS
    And I navigate to Add Employee Page

	@smoke
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

  @inProgress   
  Scenario: Add and Modify Employee Details
    When I enter employee details
      | FirstName | MiddleName | LastName |
      | John      | J          | Smith    |
    And I click Save
    And I click on Edit
    Then I am able to modify Employee Details
      | DriverLisence | ExpirationDate | SSN         | SIN     | Gender | MaritalStatus | Nationality | DOB        |
      | N78787886     | 2021-12-08     | 123-45-6789 | 7687687 | Male   | Other         | Afghan      | 1980-10-10 |
      | Nhkjkgkhgkg   | 2018-12-08     | yiy-45-6789 | uyiy    | Female | Married       | Burmese     | 1980-10-10 |
      
      
      