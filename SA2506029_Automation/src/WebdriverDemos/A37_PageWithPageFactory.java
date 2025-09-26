package WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A37_PageWithPageFactory extends baseFunction {

	// this keywords represents current object class.
	@FindBy(id = "email")
	WebElement usernameField;
	@FindBy(id = "pass")
	WebElement passwordField;
	@FindBy(name = "login")
	WebElement loginButton;

	public void setup() {
		PageFactory.initElements(driver, this);
	}

	@BeforeMethod
	public void tearUp() {
		launchBrowser("chrome");
		setup();
		launchURL("https://www.facebook.com/");
	}

	@Test
	public void loginFacebook() {
		usernameField.sendKeys("nitin@gmail.com");
		passwordField.sendKeys("password");
		loginButton.click();

	}

	@AfterMethod
	public void tearDown() {
		quitDriver();
	}

}
