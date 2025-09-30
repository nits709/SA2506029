package WebdriverDemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class A38_ROBOT extends baseFunction{

	
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		launchURL("https://sampleapp.tricentis.com/101/app.php");
		
		try {
			Robot rb = new Robot();
			driver.findElement(By.linkText("Automobile")).click();
			driver.findElement(By.linkText("Enter Insurant Data")).click();
			
			driver.findElement(By.id("open")).click();
			
			Thread.sleep(5000);
			
			rb.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(5000);
			
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			
			
		}
		
		
		
		
		 catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
