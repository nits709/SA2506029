package httpMethodsBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetRequestBDD {
	
	//log( to print the responses in rest assured using BDD)
	
	String appURL = "https://reqres.in/api/users?page=2";
	
	@Test
	public void getUserList() {
		
		// all() print complete response from server
		//given().when().get(appURL).then().log().all();
		
		given().header("x-api-key", "reqres-free-v1").when().get(appURL).then().statusCode(200) // 1st validation
		.body("page",equalTo(2))
		.body("data.id", hasItems(7,8,9,10,11,12))
		.body("data.id", hasItems(12,11,10,9,8,7)) // checks the data existence in response.
		.body("data.id", contains(7,8,9,10,11,12))// checks the data order and existence in response.
		.body("data.id", contains(12,11,10,9,8,7)); 
		
		
		
		
		
	}
	

}
