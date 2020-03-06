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
    },
    {
      "name": "@inProgress"
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
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});