package WebdriverDemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class SA26_HandlingPromptAlert extends baseFunction {

	static String appURL = "https://demoqa.com/alerts";

	public static void main(String[] args) {

		launchBrowser("chrome");
		launchURL(appURL);

		Alert alt;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// simple alert function.
		//argument[0] - it maching and filter techn. to identify the element over page.
		js.executeScript("arguments[0].click();", driver.findElement(By.id("promtButton")));
		// clicking on element ot trigger alert prompt
		//driver.findElement(By.id("promtButton")).click();

		// passing selenium context to alert by using switchTo method
		alt = driver.switchTo().alert();

		System.out.println("get text present over alert " + alt.getText());

		// enter data into prompt alert
		alt.sendKeys("Selenium Automation");
		alt.accept();

		String alertValidation = driver.findElement(By.id("promptResult")).getText();

		if (alertValidation.contains("Selenium Automation")) {
			System.out.println("testcase passed");
		}

		driver.close();
	}

}
