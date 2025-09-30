package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class loginSteps {

	loginPage lp = new loginPage();

	@Given("The user launch application {string}")
	public void the_user_launch_application(String string) {
		lp.openApplication(string);
	}

	@When("The user enter valid credentials {string} and {string}")
	public void the_user_enter_valid_credentials_and(String username, String password) {
		lp.loginIntoApplication(username, password);
	}

	@Then("The user validate the login page with title {string}")
	public void the_user_validate_the_login_page_with_title(String expectedTitle) {
		lp.navigateUserToLoginPage(expectedTitle);
	}
}
