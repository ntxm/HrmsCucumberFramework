$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Report.feature");
formatter.feature({
  "name": "Reports",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint4,"
    },
    {
      "name": "@reports"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the Reports Page",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.navigate_to_the_Reports_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for invalid report",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint4,"
    },
    {
      "name": "@reports"
    }
  ]
});
formatter.step({
  "name": "I enter invalid report",
  "keyword": "When "
});
formatter.match({
  "location": "ReportsSteps.i_enter_invalid_report()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see no record found message",
  "keyword": "Then "
});
formatter.match({
  "location": "ReportsSteps.i_see_no_record_found_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the Reports Page",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.navigate_to_the_Reports_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for valid report",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint4,"
    },
    {
      "name": "@reports"
    }
  ]
});
formatter.step({
  "name": "I enter valid report",
  "keyword": "When "
});
formatter.match({
  "location": "ReportsSteps.i_enter_valid_report()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the search report is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ReportsSteps.i_see_the_search_report_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Add New Report",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click Add button",
  "keyword": "When "
});
formatter.step({
  "name": "I add report with \"\u003creportName\u003e\", \"\u003cselectedCriteria\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I choose field Group \"\u003cfieldGroup\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click add Display Field Groups",
  "keyword": "And "
});
formatter.step({
  "name": "I click on checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "I click Save Report button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "reportName",
        "selectedCriteria",
        "fieldGroup"
      ]
    },
    {
      "cells": [
        "Employee",
        "Current Employees Only",
        "Personal"
      ]
    },
    {
      "cells": [
        "Candidates",
        "Current Employees Only",
        "Skills"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the Reports Page",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.navigate_to_the_Reports_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add New Report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint4,"
    },
    {
      "name": "@reports"
    }
  ]
});
formatter.step({
  "name": "I click Add button",
  "keyword": "When "
});
formatter.match({
  "location": "ReportsSteps.i_click_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add report with \"Employee\", \"Current Employees Only\"",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_add_report_with(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose field Group \"Personal\"",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_choose_field_Group(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click add Display Field Groups",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_click_add_Display_Field_Groups()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_click_on_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save Report button",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_click_Save_Report_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the Reports Page",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.navigate_to_the_Reports_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add New Report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint4,"
    },
    {
      "name": "@reports"
    }
  ]
});
formatter.step({
  "name": "I click Add button",
  "keyword": "When "
});
formatter.match({
  "location": "ReportsSteps.i_click_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add report with \"Candidates\", \"Current Employees Only\"",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_add_report_with(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose field Group \"Skills\"",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_choose_field_Group(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click add Display Field Groups",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_click_add_Display_Field_Groups()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_click_on_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save Report button",
  "keyword": "And "
});
formatter.match({
  "location": "ReportsSteps.i_click_Save_Report_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});