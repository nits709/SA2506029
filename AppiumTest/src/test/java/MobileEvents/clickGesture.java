package MobileEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtils.AppiumDriverinitialization;

public class clickGesture {

	@Test
	public void testClickGestures() {
		AppiumDriver driver = AppiumDriverinitialization.createAppiumDriver();
		WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		
		// Java
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) ele1).getId()
		));

	}

}
