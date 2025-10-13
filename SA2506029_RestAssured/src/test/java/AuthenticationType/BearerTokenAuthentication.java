package AuthenticationType;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class BearerTokenAuthentication {

	
	String gitToken = "use user specific token";
	
	
	@Test
	public void getGitHubRepoInfo() {
		
		Response res = given().header("Authorization","Bearer "+gitToken)
		.when().get("https://api.github.com/user/repos");
		
		res.then().log().body();
		
		
	}
}
