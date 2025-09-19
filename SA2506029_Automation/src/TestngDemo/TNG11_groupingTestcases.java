package TestngDemo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebdriverDemos.baseFunction;

public class TNG11_groupingTestcases extends baseFunction {

	@BeforeTest(alwaysRun=true)
	public void setupBrowser() {
		launchBrowser("chrome");
	}

	@BeforeMethod(alwaysRun=true)
	public void LaunchURL() {
		launchURL("https://www.amazon.in/");
		sleep();
	}

	@AfterTest(alwaysRun=true)
	public void closeBrowser() {
		quitDriver();
	}

	@Test(priority = 1, groups = "Sell")
	public void testSellLink() {
		driver.findElement(By.linkText("Sell")).click();
		System.out.println("TestSellLink");
	}

	@Test(priority = 2, groups = "Sell")
	public void testBestsellersLink() {
		driver.findElement(By.linkText("Bestsellers")).click();
		System.out.println("Bestsellers");
	}

	@Test(priority = 3,  groups="Mobilegroup")
	public void testElectronicsLink() {
		driver.findElement(By.linkText("Electronics")).click();
		System.out.println("Electronics");
	}

	@Test(priority = 4,groups="Mobilegroup")
	public void testMobileLink() {
		driver.findElement(By.linkText("Mobiles")).click();
		System.out.println("Mobiles");
	}

}
