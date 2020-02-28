Feature: API Employee PUT request

Background:
Given user genereates token

@APITest11
Scenario:
Given user calls updateEmployee API
When user retrieve response request 
Then verify status code OK
And verify user was updated