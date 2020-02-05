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
formatter.scenarioOutline({
  "name": "Add new employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add new employee with \"\u003cfirstName\u003e\", \"\u003cmiddleName\u003e\" and \"\u003clastName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I ckick Save",
  "keyword": "And "
});
formatter.step({
  "name": "I verify if employee successfylly created",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "middleName",
        "lastName"
      ]
    },
    {
      "cells": [
        "Marsha",
        "Low",
        "Green"
      ]
    },
    {
      "cells": [
        "Marsha",
        "Low",
        "Red"
      ]
    },
    {
      "cells": [
        "Marsha",
        "Low",
        "Orange"
      ]
    },
    {
      "cells": [
        "Marsha",
        "Low",
        "Pink"
      ]
    },
    {
      "cells": [
        "Marsha",
        "Low",
        "Purple"
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint2,"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add new employee with \"Marsha\", \"Low\" and \"Green\"",
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
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint2,"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add new employee with \"Marsha\", \"Low\" and \"Red\"",
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
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint2,"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add new employee with \"Marsha\", \"Low\" and \"Orange\"",
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint2,"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add new employee with \"Marsha\", \"Low\" and \"Pink\"",
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
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint2,"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add new employee with \"Marsha\", \"Low\" and \"Purple\"",
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
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
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
  "name": "Add and Modify Employee Details",
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
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I enter employee details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName"
      ]
    },
    {
      "cells": [
        "John",
        "J",
        "Smith"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_enter_employee_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am able to modify Employee Details",
  "rows": [
    {
      "cells": [
        "DriverLisence",
        "ExpirationDate",
        "SSN",
        "SIN",
        "Gender",
        "MaritalStatus",
        "Nationality",
        "DOB"
      ]
    },
    {
      "cells": [
        "N787878869",
        "2021-12-08",
        "123-45-6789",
        "7687687",
        "Male",
        "Other",
        "Afghan",
        "1980-10-10"
      ]
    },
    {
      "cells": [
        "L247091920",
        "2018-12-08",
        "123-45-0000",
        "1010101",
        "Female",
        "Married",
        "Burmese",
        "1980-10-10"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_am_able_to_modify_Employee_Details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png");
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
formatter.scenarioOutline({
  "name": "Invalid Login and message validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "I see \"\u003cerrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "errorMessage"
      ]
    },
    {
      "cells": [
        "Admin",
        "Admin123",
        "Invalid credentials"
      ]
    },
    {
      "cells": [
        "Admin",
        "",
        "Password cannot be empty"
      ]
    },
    {
      "cells": [
        "",
        "Syntax@123",
        "Username cannot be empty"
      ]
    },
    {
      "cells": [
        "",
        "",
        "Username cannot be empty"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Invalid Login and message validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint1,"
    },
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Admin\" and \"Admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_enter_and(String,String)"
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
  "name": "I see \"Invalid credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_see(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid Login and message validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint1,"
    },
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Admin\" and \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_enter_and(String,String)"
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
  "name": "I see \"Password cannot be empty\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_see(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid Login and message validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint1,"
    },
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"\" and \"Syntax@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_enter_and(String,String)"
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
  "name": "I see \"Username cannot be empty\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_see(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded8.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid Login and message validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint1,"
    },
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"\" and \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_enter_and(String,String)"
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
  "name": "I see \"Username cannot be empty\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_see(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png");
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
    },
    {
      "name": "@regression"
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
formatter.embedding("image/png", "embedded10.png");
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
    },
    {
      "name": "@regression"
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
formatter.embedding("image/png", "embedded11.png");
formatter.after({
  "status": "passed"
});
});