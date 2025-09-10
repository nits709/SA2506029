package WebdriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SA25_HandlingAlertWithExplicitWait extends baseFunction{

	//timerAlertButton
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		launchURL("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Alert alt;  // interface , i have create reference
		
		//clicking on element to trigger alert on page
		driver.findElement(By.id("timerAlertButton")).click();
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.alertIsPresent());// wait till the alert present
		
		alt = driver.switchTo().alert();
		
		System.out.println("text present on alert -->" + alt.getText());
		
		alt.accept();
		
		sleep();
		driver.close();
		
		
		
	}
}
