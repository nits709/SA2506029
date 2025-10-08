package api_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonValidations_RestAssured {

	String appURL = "https://reqres.in/api/users?page=2";

	@Test
	public void testJsonPathInResponse() {
		// Response res = RestAssured.get(appURL);
		// res.header("x-api-key: reqres-free-v1");
		// System.out.println("Response " + res.asPrettyString());

		RequestSpecification r = RestAssured.given().header("x-api-key", "reqres-free-v1");
		Response res = r.get(appURL);

		int pageIndex = res.jsonPath().get("page");
		int total_page = res.jsonPath().get("total_pages");
		System.out.println(pageIndex + " : " + total_page);

		// fetching firstname from Oth index of array

		String firstname = res.jsonPath().get("data[0].first_name");
		System.out.println("FirstName " + firstname);
		Assert.assertEquals(firstname, "Michael", "First_name are not maching");

		String lastname = res.jsonPath().get("data[4].last_name");
		Assert.assertEquals(lastname, "Edwards");

	}

}
