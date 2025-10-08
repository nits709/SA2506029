package api_Methods;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMultipleJsonValue {

	
	String appURL = "https://reqres.in/api/users?page=2";
	
	@Test
	public void getMultipleJsonValues() {
		
		RequestSpecification r = RestAssured.given().header("x-api-key", "reqres-free-v1");
		Response res = r.get(appURL);

		System.out.println(res.asPrettyString());
		//data[0].id
		// data.id
		
		// below function return multiple matching value by using json path.
	List<Integer> NoOfIds = res.jsonPath().get("data.id");
	List<Integer> NoOfId = res.jsonPath().getList("data.id");
		System.out.println("Number if ID present in jsonpath "+NoOfIds.size());
		
		for(Integer id :NoOfIds) {
			System.out.println(" id's "+ id);
		}
		
		
		
		
		
	}
	
}
