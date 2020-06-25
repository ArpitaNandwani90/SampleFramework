package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[text() = 'Login']")
	WebElement loginbtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String eID,String pwd) {
		email.sendKeys(eID);
		password.sendKeys(pwd);
	}
	
	public HomePage clickonlogin() {
		loginbtn.click();
		return new HomePage();
	}
}
