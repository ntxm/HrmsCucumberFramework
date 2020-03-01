Feature: Get all job titles API

Background:
Given user genereates token

@SyntaxHRMSAPIEndToEnd
Scenario:
Given user calls getAllJobTitles API to see list of job titles
When user retrieve response from getAll Job Titles API
Then status code is 200 for getAllTitles
And user validates Titles was retreived