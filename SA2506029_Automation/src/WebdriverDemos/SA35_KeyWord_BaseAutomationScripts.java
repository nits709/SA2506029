package WebdriverDemos;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SA35_KeyWord_BaseAutomationScripts {

	WebDriver dr;
	File file;
	FileInputStream fis;
	Properties prop;

	String filePath = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces/Automation_SA2506029/SA250629_WebDriver/SA2506029_Automation/keyWordDriver.properties";

	@BeforeTest
	public void setupObjects() {

		file = new File(filePath);
		try {

			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeMethod
	public void setupBrowser() {
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(prop.getProperty("app_URL"));
		System.out.println("appURl "+prop.getProperty("app_URL"));
	}

	@AfterMethod
	public void closeBrowser() {
		dr.quit();
	}

	@Test
	public void automationFacebook() {

		dr.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));
		dr.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
		dr.findElement(By.name(prop.getProperty("login_name"))).click();

	}

}
