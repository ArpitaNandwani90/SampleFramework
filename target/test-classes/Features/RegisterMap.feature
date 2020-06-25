Feature: User Registeration Feature

Scenario: Verify that user is able to register successfully
Given I am on HomePage
When I click on Register Link
And I fill the basic information in the registeration form
| FirstName| LastName |PhoneNumber | EmailID            |      Address                     | City  | State |PostalCode|Country|Username            | Password | ConfirmPassword|
| TestUser | TestUser | 0123456789 | testuser@gmail.com | 190A pocket-C Mayur Vihar Phase2 | Delhi | Delhi | 110092   | INDIA | testuser@gmail.com | testuser | testuser       |
| AdminUser| AdminUser| 9876543210 | adminuser@gmail.com| 195A pocket-C Mayur Vihar Phase2 | Delhi | Delhi | 110092   | INDIA | adminuser@gmail.com| adminuser| adminuser      |
And I click on Submit button
Then I should be able to register successfully