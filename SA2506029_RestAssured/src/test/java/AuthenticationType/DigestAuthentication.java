package AuthenticationType;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DigestAuthentication {
	
	
	String Username = "postman";
	String Password = "password";
	String appURL = "https://postman-echo.com/basic-auth";
	
	
	@Test
	public void digestAuthentication() {
		Response res = given().auth().digest(Username, Password).when().get(appURL);

		res.then().log().body();
		boolean status = res.jsonPath().getBoolean("authenticated");
		Assert.assertEquals(status, true);
	}

}
