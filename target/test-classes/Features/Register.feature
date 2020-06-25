Feature: User Registeration Feature
@regressiontest
Scenario: Verify that user is able to register successfully
Given I am on HomePage
When I click on Register Link
And I fill the basic information in the registeration form
| TestUser | TestUser | 0123456789 | testuser@gmail.com | 190A pocket-C Mayur Vihar Phase2 | Delhi | Delhi | 110092 | INDIA | testuser@gmail.com | testuser | testuser |
And I click on Submit button
Then I should be able to register successfully