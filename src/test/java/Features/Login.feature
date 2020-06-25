Feature: User login feature

Scenario: Verify that user is able to login successfully with his credentials
Given I am on login page
When I enter my credentials
And I click on sign-in button
Then I should be able to login successfully
