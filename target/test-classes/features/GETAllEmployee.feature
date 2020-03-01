Feature: Get All Employee API

Background:
Given user genereates token

@SyntaxHRMSAPIEndToEnd
Scenario: Verify all employee into the system
Given user calls getAllEmployee API to see list of employee
When user retrieve response from getAll Employee API
Then status code is 200 for getAllEmployee
And user validates employees was retreived
