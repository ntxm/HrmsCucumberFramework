$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddCandidate.feature");
formatter.feature({
  "name": "Recruitment. Add Candidates and Vacancies",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint3"
    },
    {
      "name": "@recruitment"
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
  "name": "navigate to add candidate page",
  "keyword": "And "
});
formatter.match({
  "location": "AddCandidateSteps.navigate_to_add_candidate_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create new Candidate",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint3"
    },
    {
      "name": "@recruitment"
    },
    {
      "name": "@inProgress"
    }
  ]
});
formatter.step({
  "name": "I provide information about candidate",
  "keyword": "When "
});
formatter.match({
  "location": "AddCandidateSteps.i_provide_information_about_candidate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose date of application",
  "keyword": "And "
});
formatter.match({
  "location": "AddCandidateSteps.choose_date_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCandidateSteps.i_click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see candidate at the table",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCandidateSteps.i_should_see_candidate_at_the_table()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Name of candidate NOT matched\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat com.hrms.steps.AddCandidateSteps.i_should_see_candidate_at_the_table(AddCandidateSteps.java:79)\n\tat ✽.I should see candidate at the table(file:src/test/resources/features/AddCandidate.feature:13)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});