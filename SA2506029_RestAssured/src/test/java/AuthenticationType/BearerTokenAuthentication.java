package AuthenticationType;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class BearerTokenAuthentication {

	
	String gitToken = "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";
	
	
	@Test
	public void getGitHubRepoInfo() {
		
		Response res = given().header("Authorization","Bearer "+gitToken)
		.when().get("https://api.github.com/user/repos");
		
		res.then().log().body();
		
		
	}
}
