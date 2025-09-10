package WebdriverDemos;

import org.openqa.selenium.By;

public class SA27_HandlingNavigationFunctions extends baseFunction{

	
	
	public static void main(String[] args) {
		
		//driver.get() - 
		launchBrowser("chrome");
		launchURL("https://demoqa.com/alerts");
		System.out.println("12 title of URL "+ driver.getTitle()); // DEMOQA
		
		driver.navigate().to("https://google.co.in");
		System.out.println("15 title of URL "+ driver.getTitle()); // google
		
		
		driver.findElement(By.linkText("About")).click();
		System.out.println("21 title of URL "+ driver.getTitle()); // about
		
		
		driver.navigate().back();
		System.out.println("25 title of URL "+ driver.getTitle()); // google
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		System.out.println("30 title of URL "+ driver.getTitle()); // About
		
		
		driver.close();
		
		
		
		
		
	}
}
