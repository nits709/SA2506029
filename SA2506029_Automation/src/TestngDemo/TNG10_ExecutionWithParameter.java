package TestngDemo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import WebdriverDemos.baseFunction;

public class TNG10_ExecutionWithParameter extends baseFunction {

	@BeforeTest
	public void setupBrowser() {
		launchBrowser("chrome");
		launchURL("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void stopBrowser() {
		quitDriver();
	}

	@Parameters({ "username", "password" })
	@Test()
	public void loginAutomation(String username, String password) {

		System.out.println("Username " + username + " : " + "Password " + password);
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
