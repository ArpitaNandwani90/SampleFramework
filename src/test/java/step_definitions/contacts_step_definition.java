package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.ContactsPage;
import pages.CreateNewContactPage;
import pages.HomePage;
import pages.LoginPage;
import util.TestBase;

public class contacts_step_definition extends TestBase{
	LoginPage loginpage;
	HomePage  homepage;
	ContactsPage contactspage;
	CreateNewContactPage createnewcontactpage;
	
	@Given("^I am on contacts page$")
	public void i_am_on_contacts_page() {
		TestBase.initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage = loginpage.clickonlogin();
		contactspage = homepage.clickoncontactslink();
		
		
	    
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String newbtn) {
		
		if(newbtn.contentEquals("New")) {
			
			createnewcontactpage = contactspage.clickonnewcontactlink();
			
		}
		else if(newbtn.contentEquals("Save")) {
			contactspage = createnewcontactpage.saveDetails();
		}
	    
	}

	@Then("^I should be on \"([^\"]*)\" Page$")
	public void i_should_be_on_Page(String pgname) {
		System.out.print(createnewcontactpage);
		String currentpage = createnewcontactpage.verifyPageName();
		System.out.print(currentpage);
		Assert.assertEquals(pgname, currentpage);
	    
	}

	@When("^I enter the contact details$")
	public void i_enter_the_contact_details()  {
		createnewcontactpage.fillDetails(prop.getProperty("firstname"), prop.getProperty("lastname"));   
	}
	
	@Then("^I should be able to create new contact successfully$")
	public void i_should_be_able_to_create_new_contact_successfully() {
		//contactspage = homepage.clickoncontactslink();
		//contactspage.clickonContacts();
		//contactspage.verifycontact();
		String expectedContact = prop.getProperty("firstname")+" "+prop.getProperty("lastname");
		String actualContact = contactspage.verifycontact();
		System.out.print("Actual contact is "+actualContact);
		Assert.assertEquals(expectedContact, actualContact);
	    
	}

}
