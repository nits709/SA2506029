package TestngDemo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebdriverDemos.baseFunction;

public class TNG_07_Login extends baseFunction {

	@BeforeTest
	public void setupBrowser() {
		launchBrowser("chrome");
		launchURL("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void stopBrowser() {
		quitDriver();
	}

	@Test(priority=1)
	public void loginAutomation() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}
	
	
	@Test(priority=2)
	public void loginAutomation1() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Nitin");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}
	
	
	@Test(priority=3)
	public void loginAutomation2() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	}

}
