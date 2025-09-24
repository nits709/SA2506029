package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleTitleSteps {
	
	
	
	@Given("The User launch google URL")
	public void the_user_launch_google_url() {
	    System.out.println("URL is  calling");
	}

	@When("The User reads page title")
	public void the_user_reads_page_title() {
		System.out.println("reading the title");
	}

	@Then("The User validate Page title")
	public void the_user_validate_page_title() {
		System.out.println("validate the page Title");
	}

}
