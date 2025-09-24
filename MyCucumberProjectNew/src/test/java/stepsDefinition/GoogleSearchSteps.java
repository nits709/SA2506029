package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver;

	@Given("The user launch application URl on browser")
	public void the_user_launch_application_u_rl_on_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.co.in");

	}

	@When("Enter data in search box")
	public void enter_data_in_search_box() {
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("selenium Webdriver");
	}

	@When("Hit Enter")
	public void hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("The user validate the search result")
	public void the_user_validate_the_search_result() {
		driver.getTitle().contains("Selenium");
	}
}
