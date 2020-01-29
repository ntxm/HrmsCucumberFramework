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
    
    
