package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationExcerciseLogin {

	WebDriver driver;

	@Given("The user launch application URL {string}")
	public void the_user_launch_application_url(String appURL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(appURL);
	}

	@When("The user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String username, String password) {
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys(password);
	}

//	@Given("The user launch application URL")
//	public void the_user_launch_application_url() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user enters username and password")
//	public void the_user_enters_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("The user submit the login credentails")
	public void the_user_submit_the_login_credentails() {
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	}

	@Then("The User validates login successfully")
	public void the_user_validates_login_successfully() {
		driver.findElement(By.cssSelector(".fa.fa-user")).isDisplayed();
		driver.close();

	}
}
