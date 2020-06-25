$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Arpita/eclipse-workspace/NewTours/src/test/java/Features/Contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Contacts functionality",
  "description": "",
  "id": "contacts-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify that I am able to create new contact",
  "description": "",
  "id": "contacts-functionality;verify-that-i-am-able-to-create-new-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on contacts page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click on \"New\" button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be on \"Create New Contact\" Page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I enter the contact details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on \"Save\" button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be able to create new contact successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "contacts_step_definition.i_am_on_contacts_page()"
});
formatter.result({
  "duration": 14975591700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New",
      "offset": 12
    }
  ],
  "location": "contacts_step_definition.i_click_on_button(String)"
});
formatter.result({
  "duration": 163849500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create New Contact",
      "offset": 16
    }
  ],
  "location": "contacts_step_definition.i_should_be_on_Page(String)"
});
formatter.result({
  "duration": 12312365300,
  "status": "passed"
});
formatter.match({
  "location": "contacts_step_definition.i_enter_the_contact_details()"
});
formatter.result({
  "duration": 1256972500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Save",
      "offset": 12
    }
  ],
  "location": "contacts_step_definition.i_click_on_button(String)"
});
formatter.result({
  "duration": 271373900,
  "status": "passed"
});
formatter.match({
  "location": "contacts_step_definition.i_should_be_able_to_create_new_contact_successfully()"
});
formatter.result({
  "duration": 18992000,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Shelly Cooper]\u003e but was:\u003c[Create New Contact]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat step_definitions.contacts_step_definition.i_should_be_able_to_create_new_contact_successfully(contacts_step_definition.java:67)\r\n\tat ✽.Then I should be able to create new contact successfully(C:/Users/Arpita/eclipse-workspace/NewTours/src/test/java/Features/Contacts.feature:8)\r\n",
  "status": "failed"
});
});