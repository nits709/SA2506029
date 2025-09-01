package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_02_Echotrack_Login {

	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.className("form-control")).sendKeys("123456789876543");
		driver.findElement(By.id("txtPassword")).sendKeys("Smart@123");
	}
}
