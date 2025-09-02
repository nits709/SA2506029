package WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_12_ReadByAbsoluteXpath_ReadText {

	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		String title = driver.findElement(By.xpath("html/body/div/main/div/div/div/h1")).getText();
		System.out.println("Form Title --> "+ title);
		
		
		if(title.equals("Sign in")) {
			driver.findElement(By.xpath("html/body/div/main/div/div/form/div[1]/input")).sendKeys("nitin@gmail.com");
			driver.findElement(By.xpath("html/body/div/main/div/div/form/div[2]/input")).sendKeys("XXXXXXX");
		}
		
		
	}
}
