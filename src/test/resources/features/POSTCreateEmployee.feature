Feature: Validating Syntax HRMS API's

Background:
Given user genereates token

@APITest11
Scenario: This test will check to see if an Employee is created
Given user calls createEmployee API
When user retreive response
Then status code is OK
Then user validates employee is created

