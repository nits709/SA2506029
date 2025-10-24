package AndroidDevice_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtils.AppiumDriverinitialization;

public class AndroidSpecific_Commands {

	@Test
	public void testAndroidSpecificCommands() throws InterruptedException {
		AppiumDriver driver = AppiumDriverinitialization.createAppiumDriver();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 100, "top", 100,
				"width", 200, "height", 200, "endX", 665, "endY", 2148, "direction", "Down", "percent", 0.75));

		
		Thread.sleep(4000);
		WebElement internetArrow = driver.findElements(AppiumBy.id("com.android.systemui:id/chevron")).get(0);
		internetArrow.click(); // this will gonna click on internet and makes setting window opend.
		
//		Thread.sleep(4000);
//		//ON --> OFF Wifi
//		((AndroidDriver)driver).toggleWifi();
//		
//		Thread.sleep(4000);
//		
//		//OFF ---> ON Wifi
//		((AndroidDriver)driver).toggleWifi();
//		
//		
//		Thread.sleep(4000);
//		
//		
//		//ON --> OFF MobileData
//		((AndroidDriver)driver).toggleData();
//		
//		
//		//OFF --> ON MobileData
//		((AndroidDriver)driver).toggleData();
//		
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.id("com.android.systemui:id/done_button")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(AppiumBy.accessibilityId("Airplane mode")).click();
		
		
		Thread.sleep(2000);
		
		
		//below command opens notification window/screen
		((AndroidDriver)driver).openNotifications();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
