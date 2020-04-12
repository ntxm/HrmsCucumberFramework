Feature: Practice API


Background:
Given generate token

@APIpractice
Scenario:
Given I call create Employee API and send request
When I retreive response
Then I get status code 200 response
And I verify data

