package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement Username;
	@FindBy(id = "password")
	WebElement Password;
	@FindBy(id = "submit")
	WebElement Submit;

	public void username(String uname) {
		Username.sendKeys(uname);
	}

	public void password(String pwd) {
		Password.sendKeys(pwd);
	}

	public void submit() {
		Submit.click();
	}
}
