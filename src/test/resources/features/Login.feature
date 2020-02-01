@sprint1, @login
Feature: Login

  @smoke
  Scenario: Valid login
    When I enter valid username and valid password
    And I click on the login button
    Then I successfully logged in



	@regression
  Scenario Outline: Invalid Login and message validation
    When I enter "<username>" and "<password>"
    And I click on the login button
    Then I see "<errorMessage>"

    Examples: 
      | username | password   | errorMessage             |
      | Admin    | Admin123   | Invalid credentials      |
      | Admin    |						| Password cannot be empty |
      |          | Syntax@123 | Username cannot be empty |
      |          |            | Username cannot be empty |
