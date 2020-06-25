package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;
import util.TestBase;

public class login_step_definition extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^I am on login page$")
	public void i_am_on_login_page() {
		
		TestBase.initialization();
	    
	}

	@When("^I enter my credentials$")
	public void i_enter_my_credentials() {
		loginpage = new LoginPage();
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		    
	}

	@When("^I click on sign-in button$")
	public void i_click_on_sign_in_button() {
		
		homepage = loginpage.clickonlogin();
	    
	}

	@Then("^I should be able to login successfully$")
	public void i_should_be_able_to_login_successfully() {
		
		boolean flag = homepage.verifyuserDisplay();
		Assert.assertEquals(true, flag);
	}

}
