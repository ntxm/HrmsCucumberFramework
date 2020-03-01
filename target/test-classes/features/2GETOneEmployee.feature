Feature: Get One Employee API

Background:
Given user genereates token

@SyntaxHRMSAPIEndToEnd
Scenario: Retrieving created employee using getOneEmployee.php API
Given user calls getOneEmployee API
When User retrieves response for getOneEmployee.php API
Then status code is 200 for getOneEmployeeAPI
Then user validates created employee exists