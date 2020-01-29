#Author: Natalie
Feature: report

  Background: 
    Given I logged in into HRMS
    And navigate to the Reports Page

  Scenario: Search for invalid report
    When I enter invalid report
    And I click search button
    Then I see no record found message

  Scenario: Search for valid report
    When I enter valid report
    And I click search button
    Then I see the search report is displayed

  Scenario Outline: Add New Report
  When I click Add button
  And I add report with "<reportName>", "<selectedCriteria>"
  And I choose field Group "<fieldGroup>"
  And I click add Display Field Groups
  And I click on checkbox
  And I click Save Report button
  
  Examples:
  |reportName		|selectedCriteria				|fieldGroup		|
	|Employee  		|Current Employees Only |Personal  		|
	|Candidates		|Current Employees Only |Skills				|
	
	
	
	