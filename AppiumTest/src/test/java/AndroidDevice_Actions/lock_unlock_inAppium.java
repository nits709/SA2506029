package AndroidDevice_Actions;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtils.AppiumDriverinitialization;

public class lock_unlock_inAppium {

	
	@Test
	public void testAndroidDevicesAction() throws InterruptedException {
		AppiumDriver driver = AppiumDriverinitialization.createAppiumDriver();
		
		Thread.sleep(4000);
		
		//lock my device.
		((AndroidDriver)driver).lockDevice();
		
		Thread.sleep(2000);
		
		
		((AndroidDriver)driver).unlockDevice();
		
		Thread.sleep(2000);
		
		
		
		//this will rotate my mobile into landscape view
		
		((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(2000);
		
		//this will rotate my mobile into portrait view
		((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
		
	}
}
