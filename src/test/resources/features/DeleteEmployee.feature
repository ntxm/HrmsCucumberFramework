Feature: Test API delete employee

Background:
Given user genereates token

@APITest
Scenario:
Given user call delete employee API
When user try to retreive response 
Then returned status code OK
And verify that user was deleted