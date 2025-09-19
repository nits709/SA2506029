package TestngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TNG12_ParallelTestExecution {
	
	
	@Test(priority = 1)
	public void openFacebook() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

	@Test(priority = 2)
	public void openMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

	@Test(priority = 3)
	public void openGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?zx=1758037464588&no_sw_cr=1");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
