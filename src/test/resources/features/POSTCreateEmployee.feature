Feature: Validating Syntax HRMS API's

Background:
Given user genereates token

@APITest
Scenario: This test will check to see if an Employee is created
Given user calls createEmployee API
When user retreive response
Then status code is 200
Then user validates employee is created

