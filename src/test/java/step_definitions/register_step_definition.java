package step_definitions;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class register_step_definition {
	
	WebDriver driver;
	String username = "testuser@gmail.com";
	
	@Given("^I am on HomePage$")
	public void I_am_on_HomePage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arpita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
	    driver = new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@When("^I click on Register Link$")
	public void I_click_on_Register_Link() {
	    driver.findElement(By.linkText("REGISTER")).click();
	}

	@When("^I fill the basic information in the registeration form$")
	public void I_fill_the_basic_information_in_the_registeration_form(DataTable information) {
		List<List<String>> data = information.raw();
		driver.findElement(By.name("firstName")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("lastName")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("phone")).sendKeys(data.get(0).get(2));
		driver.findElement(By.name("userName")).sendKeys(data.get(0).get(3));
		driver.findElement(By.name("address1")).sendKeys(data.get(0).get(4));
		driver.findElement(By.name("city")).sendKeys(data.get(0).get(5));
		driver.findElement(By.name("state")).sendKeys(data.get(0).get(6));
		driver.findElement(By.name("postalCode")).sendKeys(data.get(0).get(7));
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText(data.get(0).get(8));
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(9));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(10));
		driver.findElement(By.name("confirmPassword")).sendKeys(data.get(0).get(11));
		
		/*
		for(Map<String, String> data :  information.asMaps(String.class, String.class)){
			driver.findElement(By.name("firstName")).sendKeys(data.get("FirstName"));
			driver.findElement(By.name("lastName")).sendKeys(data.get("LastName"));
			driver.findElement(By.name("phone")).sendKeys(data.get("PhoneNumber"));
			driver.findElement(By.name("userName")).sendKeys(data.get("EmailID"));
			driver.findElement(By.name("address1")).sendKeys(data.get("Address"));
			driver.findElement(By.name("city")).sendKeys(data.get("City"));
			driver.findElement(By.name("state")).sendKeys(data.get("State"));
			driver.findElement(By.name("postalCode")).sendKeys(data.get("PostalCode"));
			Select country = new Select(driver.findElement(By.name("country")));
			country.selectByVisibleText(data.get("Country"));
			driver.findElement(By.name("email")).sendKeys(data.get("Username"));
			driver.findElement(By.name("password")).sendKeys(data.get("Password"));
			driver.findElement(By.name("confirmPassword")).sendKeys(data.get("ConfirmPassword"));
			*/
	    
	}

	@When("^I click on Submit button$")
	public void I_click_on_Submit_button() {
		driver.findElement(By.name("register")).click();
	    
	}

	@Then("^I should be able to register successfully$")
	public void I_should_be_able_to_register_successfully() {
		String url = driver.getCurrentUrl();
		System.out.println("Current URL: "+url);
		String actualUsername = driver.findElement(By.xpath("//b[contains(text(),'Note: Your user name is testuser@gmail.com.')]")).getText();
		String expectedUsername = "Note: Your user name is "+username+".";
		Assert.assertEquals(expectedUsername, actualUsername);
	    
	}

}
