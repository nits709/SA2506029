package WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_13_ReadByRelativeXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

		String title = driver.findElement(By.xpath("//h1[@class='header__content__heading ']")).getText();
		System.out.println("Form Title --> " + title);

		if (title.equals("Sign in")) {
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nitin@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("XXXXXXX");
		}
	}
}
