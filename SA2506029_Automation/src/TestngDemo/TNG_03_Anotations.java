package TestngDemo;

import org.testng.annotations.Test;

import WebdriverDemos.baseFunction;

public class TNG_03_Anotations extends baseFunction {

	@Test(priority = 1)
	public void openFacebook() {

		launchBrowser("chrome");
		launchURL("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		quitDriver();

	}

	@Test(priority = 2)
	public void openMyntra() {

		launchBrowser("chrome");
		launchURL("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		quitDriver();

	}

	@Test(priority = 3)
	public void openGoogle() {

		launchBrowser("chrome");
		launchURL("https://www.google.com/?zx=1758037464588&no_sw_cr=1");
		System.out.println(driver.getTitle());
		quitDriver();

	}
}
