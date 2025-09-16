package TestngDemo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import WebdriverDemos.baseFunction;

public class TNG_09_PracticalImplimentation_dataProvider extends baseFunction {

	@BeforeTest
	public void setupBrowser() {
		launchBrowser("chrome");
		launchURL("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void stopBrowser() {
		quitDriver();
	}

	@Test(dataProvider = "supplyData")
	public void loginAutomation(String username, String password) {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}

	@DataProvider
	public Object[][] supplyData() {

		Object[][] data = new Object[3][2];

		// data row 1
		data[0][0] = "student";
		data[0][1] = "Password123";

		// data row 2
		data[1][0] = "student";
		data[1][1] = "Password123";

		// data row 3
		data[2][0] = "student";
		data[2][1] = "Password123";

		return data;

	}
}
