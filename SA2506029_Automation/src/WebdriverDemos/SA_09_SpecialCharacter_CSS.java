package WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_09_SpecialCharacter_CSS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		
		//* character
		WebElement username = driver.findElement(By.cssSelector("input[data-testid*='e']"));
		username.sendKeys("nitin@yopmail.com");
			
		
		//Ends-with $ character (Ends with when starting part of attribute value is dynamic nature)
		WebElement password = driver.findElement(By.cssSelector("input[data-testid$='pass']"));
		password.sendKeys("Smart@123");
			
			
		//starts-with ^ character  |button[id^='u_0_5'][data-testid^='royal']
		driver.findElement(By.cssSelector("button[id^='u_0_5'][id^='u_0_5']")).click();

	}

}
