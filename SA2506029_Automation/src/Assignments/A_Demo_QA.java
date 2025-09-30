package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import WebdriverDemos.baseFunction;

public class A_Demo_QA extends baseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		launchURL("https://demoqa.com/automation-practice-form");

		driver.findElement(By.id("firstName")).sendKeys("Nitin");
		driver.findElement(By.id("lastName")).sendKeys("Nitin");
		driver.findElement(By.id("userEmail")).sendKeys("nitin@gmail.com");
		//Thread.sleep(2000);
		//driver.findElement(By.id("gender-radio-1")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8765432198");
		driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);

	}
}
