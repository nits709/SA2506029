package locatorStragyinAppium;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtils.AppiumDriverinitialization;

public class AppiumtestMobileLocators {

	@Test
	public void testLocatorWithIdandName() throws InterruptedException {

		AppiumDriver driver = AppiumDriverinitialization.createAppiumDriver();

		// assignement for guys is . get the text of multiple element and click 1 by 1
		// List<WebElement> element4 =
		// driver.findElements(AppiumBy.className("android.widget.TextView"));
		WebElement ele4 = driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
		String element4 = ele4.getText();
		System.out.println("element4 " + element4);
		ele4.click();

		Thread.sleep(4000);

		driver.navigate().back();

		//assignement for guys is . get the text of multiple element and click 1 by 1
		
		WebElement ele5 = driver.findElements(AppiumBy.id("android:id/text1")).get(2);
		String element5 = ele5.getText();
		System.out.println("Element 5 "+ element5);
		ele5.click();

	}

}
