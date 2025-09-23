package mymavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MVN_01_LaunchBrowser {

	// shortcut to import libraries - cntrol + command + o (MACOS)
	// shortcut to import libraries - cntrol + shift + o (Window)

	
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeClass calling");
	  }
	 
	 
	@Test
	public void setUpBrowser() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");

		driver.manage().window().maximize();
		System.out.println("Title " + driver.getTitle());
		
		driver.quit();

	}

}
