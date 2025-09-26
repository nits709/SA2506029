package WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class A36_JavascriptScroll extends baseFunction{
	
	
	
	public static void main(String[] args) {
		
		launchBrowser("chrome");
		launchURL("https://omayo.blogspot.com/");
		
		// starts from 0,0 --- 0,500
		//1. Scroll down by pixels (vertical)
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2000)");
//		sleep();
//		
////		//2. Scroll down by pixels (vertical)
////		js.executeScript("window.scrollBy(0,-500)");
////		sleep();
//		
//		//3. Scroll up to the Top (vertical)
//		js.executeScript("window.scrollTo(0,0)");
//		sleep();
//		
//		//4. Scroll down to bottom (vertical) -document.body.scrollHeight
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		sleep();
		
		
		//5. scroll to specific element by using scrollintoview
		
		WebElement scrollElement =driver.findElement(By.xpath("//*[text()='Check this']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollElement);
		sleep();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
