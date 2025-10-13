package AuthenticationType;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class BasicAuthentication {

	String Username = "postman";
	String Password = "password";
	String appURL = "https://postman-echo.com/basic-auth";

	@Test
	public void baseAuthentication() {
		Response res = given().auth().basic(Username, Password).when().get(appURL);

		res.then().log().body();
		boolean status = res.jsonPath().getBoolean("authenticated");
		Assert.assertEquals(status, true);

	}
}
