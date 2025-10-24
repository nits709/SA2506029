package projectUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class coreFunctions {

	public static void scrollInAppiumWithUserCount(AppiumDriver driver, WebElement area, int count) {

		for (int i = 0; i <= count; i++) {
			((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of("elementId",
					((RemoteWebElement) area).getId(), "direction", "down", "percent", 1.0));
		}
	}

	public static void scrollDown(AppiumDriver driver, WebElement area) {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "down", "percent", 1.0));
	}

	public static void scrollUp(AppiumDriver driver, WebElement area) {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "up", "percent", 1.0));
	}

	public static void scrollLeft(AppiumDriver driver, WebElement area) {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "left", "percent", 1.0));
	}

	public static void scrollRight(AppiumDriver driver, WebElement area) {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "right", "percent", 1.0));
	}

}
