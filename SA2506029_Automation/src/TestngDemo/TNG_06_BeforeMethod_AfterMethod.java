package TestngDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WebdriverDemos.baseFunction;

public class TNG_06_BeforeMethod_AfterMethod extends baseFunction{

	
	@BeforeMethod
	public void setupBrowser() {
		launchBrowser("chrome");
	}

	@AfterMethod
	public void stopBrowser() {
		quitDriver();
	}

	@Test(priority = 1)
	public void openFacebook() {

		launchURL("https://www.facebook.com/");
		System.out.println(driver.getTitle());

	}

	@Test(priority = 2)
	public void openMyntra() {

		launchURL("https://www.myntra.com/");
		System.out.println(driver.getTitle());

	}

	@Test(priority = 3)
	public void openGoogle() {

		launchURL("https://www.google.com/?zx=1758037464588&no_sw_cr=1");
		System.out.println(driver.getTitle());

	}
}
