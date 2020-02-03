$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint2,"
    },
    {
      "name": "@addEmployee"
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
  "name": "I navigate to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigate_to_Add_Employee_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2,"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I add new employee with \"Aeron\", \"Low\" and \"Baeron\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_new_employee_with_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ckick Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_ckick_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if employee successfylly created",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_verify_if_employee_successfylly_created()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#personal_txtEmpFirstName\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Natalias-MBP.home\u0027, ip: \u0027fe80:0:0:0:488:d20e:8255:4d8c%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.5\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/mw/2ygtkhyx12z...}, goog:chromeOptions: {debuggerAddress: localhost:57202}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ca38a56733a7037896b87ac86c2bd7c5\n*** Element info: {Using\u003did, value\u003dpersonal_txtEmpFirstName}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.getAttribute(Unknown Source)\n\tat com.hrms.steps.AddEmployeeSteps.i_verify_if_employee_successfylly_created(AddEmployeeSteps.java:52)\n\tat ✽.I verify if employee successfylly created(file:src/test/resources/features/AddEmployee.feature:12)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint1,"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Valid login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1,"
    },
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Report.feature");
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
formatter.scenarioOutline({
  "name": "Add New Report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
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
    },
    {
      "name": "@smoke"
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
formatter.embedding("image/png", "embedded2.png");
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
    },
    {
      "name": "@smoke"
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
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "status": "passed"
});
});