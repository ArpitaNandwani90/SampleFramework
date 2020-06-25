package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class CreateNewContactPage extends TestBase {
	
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;
	
	
	@FindBy(xpath = "//button[text() = 'Save']")
	WebElement saveButton;
	
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement pageName;
	
	public CreateNewContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void fillDetails(String fn , String ln) {
		
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
	}
	
	public String verifyPageName() {
		
		//if(!(firstName.isDisplayed()))
		for(int i=0;i<2;i++) {
		driver.navigate().refresh();
		System.out.print("Page refreshed");
		}
		return pageName.getText();
	}
	
	public ContactsPage saveDetails() {
		saveButton.click();
		return new ContactsPage();
	}
	
	public void cancelDetails() {
		cancelButton.click();
	}

}
