package httpMethodsBDD;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Headers_Cookies_QueryParameter {

	String appURL = "https://reqres.in/api/users?page=2";

	@Test
	public void getHeadersFromAPI() {

		Response res = given().header("x-api-key", "reqres-free-v1").when().get(appURL);

		// res.then().statusCode(200).log().headers();

		System.out.println("get Content-Type header  " + res.getHeader("Content-Type"));
		System.out.println("get X-Powered-By header  " + res.getHeader("X-Powered-By"));

	}

	// resources name / database table name - path parameter
	// query parameter = column name

	@Test
	public void getQueryParameter() {

		given().header("x-api-key", "reqres-free-v1").pathParam("path", "users").queryParam("page", "1").when()
				.get("https://reqres.in/api/{path}").then().statusCode(200).log().all();

	}

}
