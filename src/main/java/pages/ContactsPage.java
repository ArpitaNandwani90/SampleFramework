package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath = "//button[contains(text(),'New')]")
	WebElement newContact;
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement contactName;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public CreateNewContactPage clickonnewcontactlink() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", newContact);
		//newContact.click();
		return new CreateNewContactPage();
	}
	
	public String verifycontact() {
		return contactName.getText();
	}
	
	public void clickonContacts() {
		contactsLink.click();
	}

}
