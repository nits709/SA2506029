package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A_01_Facebook_Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");


//		
//		WebElement username = driver.findElement(By.className("inputtext"));
//		username.sendKeys("asdfghjkjhgfdsa@gmail.com");
//		
//		
//		WebElement password = driver.findElement(By.className("_9npi"));
//		password.sendKeys("agjhgfdsdfghjkjhgfds");

		WebElement username=driver.findElement(By.cssSelector("input[id='email']"));
		username.sendKeys("13243546@gmail.com");
		WebElement password=driver.findElement(By.cssSelector("input[class='_9npi']"));
		password.sendKeys("1353463572683");
		WebElement login=driver.findElement(By.cssSelector("button[class='_42ft']"));

		
		Thread.sleep(2000);

		driver.close();

	}

}
