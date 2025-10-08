package api_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_LISTUSERS {

	// Rest Assured is class in library
	// Response is special class in rest assured (interface)

	String appURL = "https://reqres.in/api/users?page=2";

	@Test
	public void getListOfUsers() {
		
		Response res =	RestAssured.get(appURL);
		System.out.println("Response "+ res.asString()); // java output
		
		System.out.println("*******************************************************");
		
		System.out.println("Response as Pretty "+ res.asPrettyString()); // json format
		
		System.out.println("status "+ res.statusCode()); //return status code.
		
		// fetch the header information from response.
		
		System.out.println("Header is " + res.getHeader("Content-Type"));
		
		
		int statusCode = res.statusCode();
		
		Assert.assertEquals(statusCode,200,"Status code are not matched, please verify");

	}

}
