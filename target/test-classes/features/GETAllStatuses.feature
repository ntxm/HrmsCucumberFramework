Feature: Get All Employee Statuses API

Background:
Given user genereates token

@SyntaxHRMSAPIEndToEnd
Scenario: Get All Employee Statuses
Given user calls getAllStatuses API to see list of employee statuses
When user retrieve response from getAllStatuses API
Then status code is 200 for getAllStatuses
And user validates all statuses was retreived
