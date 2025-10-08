package httpMethodsBDD;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Searlization_deSearalization_restassured {

	@Test
	public void searlizationTest() throws JsonProcessingException {

		pojoData pd = new pojoData();
		pd.setName("Ketaki");
		pd.setJob("Senior QA Lead");

		ObjectMapper obj = new ObjectMapper();
		String jData = obj.writerWithDefaultPrettyPrinter().writeValueAsString(pd);

		System.out.println("Convert Json Data " + jData);

	}

	@Test
	public void DesearlizationTest() throws JsonProcessingException {

		String jData = "{\n" + "  \"name\" : \"Ketaki\",\n" + "  \"job\" : \"Senior QA Lead\"\n" + "}";

		ObjectMapper obj = new ObjectMapper();
		pojoData pd = obj.readValue(jData, pojoData.class);

		System.out.println(pd.getName());
		System.out.println(pd.getJob());

	}
}
