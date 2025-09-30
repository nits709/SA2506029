package coreFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webDriverLibrary {

	WebDriver driver;

	
	public void setupConfiguration() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void urlNavigation(String url) {
		driver.get(url);
	}

	public void enterTextInToField(String locator, String testData) {

		driver.findElement(By.xpath(locator)).sendKeys(testData);
	}

	public void clickOnElement(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public void verifyPageTitle(String expectedTitle) {
		Assert.assertEquals(expectedTitle, driver.getTitle(), "PageTitle are not matched, please verify");
	}

}
