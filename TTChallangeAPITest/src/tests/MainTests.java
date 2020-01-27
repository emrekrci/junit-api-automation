package tests;

import org.junit.Test;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.JSONArray;
import org.json.JSONObject;
import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
public class MainTests extends APITestCase {
	
	
	@Test
	public void verify_api_starts_empty() {
		Response resp = get("http://restcountries.eu/rest/v1/name/norway");
		JSONArray jsonResponse = new JSONArray(resp.asString());
		String capital = jsonResponse.getJSONObject(0).getString("capital");
		assertEquals("Oslo", capital);
	}
	
	@Test
	public void verify_title_author_is_required() {
		 String APIUrl = "http://{API URL}";
		 String APIBody = "{API Body}"; //e.g.- "{\"key1\":\"value1\",\"key2\":\"value2\"}"
		 RequestSpecBuilder builder = new RequestSpecBuilder();
		 builder.setBody(APIBody);
		 builder.setContentType("application/json; charset=UTF-8");
		 RequestSpecification requestSpec = builder.build();
		 Response response = given().authentication().preemptive().basic("", "")
		 .spec(requestSpec).when().post(APIUrl);
		 JSONObject JSONResponseBody = new JSONObject(response.body().asString());
		 String result = JSONResponseBody.getString("capital");
		 assertEquals("Oslo", result);
	}
	
	@Test
	public void verify_author_title_cannot_be_empty() {
		
	}
	
	@Test
	public void verify_id_field_readonly() {
		
	}
	
	@Test
	public void create_new_book() {
		
	}
	
	@Test
	public void verify_cannot_create_dublicate_book() {
		
	}
}
