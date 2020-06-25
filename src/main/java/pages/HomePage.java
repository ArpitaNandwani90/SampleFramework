package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement userDisplay;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyuserDisplay() {
		return userDisplay.isDisplayed();
	}
	
	public ContactsPage clickoncontactslink() {
		contactsLink.click();
		return new ContactsPage();
	}

}
