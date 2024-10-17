package serializationAndDeseriallisationGetComplexData;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.List;

import io.restassured.response.Response;

public class GetRequest 
{
	@Test
	public void getRequest()
	{
		
		RestAssured.baseURI="https://petstore.swagger.io";
		CreateResponseBody responseBody = given()
				.header("content-type","application/json")
				.when()
				.get("/v2/pet/5")
				.then()
				.extract()
				.response().as(CreateResponseBody.class);
		int idValue=responseBody.getId();
		System.out.println(idValue);
		HashMap<String, Object> categoryValue = responseBody.getCategory();
		System.out.println(categoryValue);
		List<String> photoUrlValue = responseBody.getPhotoUrls();
		System.out.println("photoUrlValue:"+photoUrlValue);
		List<HashMap<String, Object>> tagsValue = responseBody.getTags();
		System.out.println("tagsValue:"+tagsValue);
		System.out.println("Response Body:"+responseBody);
		String responseInString = responseBody.toString();
		System.out.println(responseInString);
	}

}
