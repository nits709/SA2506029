package httpMethodsBDD;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PostRequestWithBDD {

	String postEndpoint = "https://reqres.in/api/users";

	// POJO = Plain old java object (encapsulation binding data + function and
	// hiding internal mechanism)
	@Test
	public void postRequestWithBasicPayload() {

		Response res = given().header("x-api-key", "reqres-free-v1")
				.body("{\n" + "    \"name\": \"Sachin Tiwari\",\n" + "    \"job\": \"Automation Engineer\"\n" + "}")
				.when().post(postEndpoint);

		// validation on status code

		Assert.assertEquals(res.getStatusCode(), 201, "Status code are not matched please verify");

		res.then().log().body();

		// print response time in milisecond
		System.out.println("Response time in MS " + res.getTime());

	}

	@Test
	public void postRequestWithHasHMap() {
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("name", "Abhishek");
		data.put("job", "Automation Architect");

		given().header("x-api-key", "reqres-free-v1").body(data).when().post(postEndpoint).then().log().body();

	}

	@Test
	public void postRequestWithPojoData() {
		pojoData pd = new pojoData();
		pd.setName("Nitin");
		pd.setJob("QA Engineer");

		given().header("x-api-key", "reqres-free-v1").body(pd).when().post(postEndpoint).then().log().body();

	}

}
