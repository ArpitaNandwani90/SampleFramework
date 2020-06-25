Feature: Contacts functionality
Scenario: Verify that I am able to create new contact
Given I am on contacts page
When I click on "New" button
Then I should be on "Create New Contact" Page
When I enter the contact details 
And I click on "Save" button
Then I should be able to create new contact successfully