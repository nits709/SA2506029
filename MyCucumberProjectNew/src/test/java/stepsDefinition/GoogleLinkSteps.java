package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleLinkSteps {

	WebDriver driver;

	@Given("I open Google URL {string}")
	public void openGoogleURL(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@When("I click on Gmail Link")
	public void clickGmailLink() {
		driver.findElement(By.linkText("Gmail")).click();
	}

	@Then("Gmail page should opened")
	public void verifyOpenedGmailPage() {
		driver.getTitle().contains("Gmail");
	}

	@When("I close browser")
	public void quitBrowser() {
		driver.quit();
	}

	@When("I click on Images Link")
	public void clickImagesLink() {
		driver.findElement(By.linkText("Images")).click();
	}

	@Then("Images page should opened")
	public void verifyOpenedImagesPage() {
		driver.getTitle().contains("Images");}

	@When("I click on Adv Link")
	public void clickAdvLink() {
		driver.findElement(By.linkText("Advertising")).click();
	}

	@Then("Adv page should opened")
		public void verifyOpenedAdvPage() {
			driver.getTitle().contains("Advertising");}

	@When("I click on Business Link")
	public void clickBusinessLink() {
		driver.findElement(By.linkText("Business")).click();
	}

	@Then("Business page should opened")
	public void verifyOpenedBusinessPage() {
		driver.getTitle().contains("Business");

	}

}
