package step_defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object_model.LoginPage;

public class LoginPageSteps {

	WebDriver driver;
	LoginPage lp;

	@Given("User should open Chrome browser")
	public void user_should_open_chrome_browser() {

		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		lp = new LoginPage(driver);
		System.out.println("Hello");
	}

	@When("User enter Username as {string} and Password as {string}")
	public void user_enter_username_as_and_password_as(String UserAddress, String PassAddress) {

		lp.username(UserAddress);
		lp.password(PassAddress);
	}

	@When("Click on Submit button")
	public void click_on_submit_button() {
		lp.submit();
	}

	@Then("Verify Title should be {string}")
	public void verify_title_should_be(String ExpectedTitle) {
		Assert.assertTrue(driver.getTitle().equals(ExpectedTitle));
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
