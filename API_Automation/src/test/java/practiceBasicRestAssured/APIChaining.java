package practiceBasicRestAssured;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class APIChaining 
{
	static String idvalue;
	static String messageValue;
	@Test(priority=1)
	public void methodChaining()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		            Response response=given()
				            		.header("Content-Type","application/json")
		            		        .body("{\r\n"
		            		        		+ "  \"id\": 0,\r\n"
		            		        		+ "  \"username\": \"Ashy\",\r\n"
		            		        		+ "  \"firstName\": \"bhujp\",\r\n"
		            		        		+ "  \"lastName\": \"ashutos\",\r\n"
		            		        		+ "  \"email\": \"as@gmail.com\",\r\n"
		            		        		+ "  \"password\": \"123wsas\",\r\n"
		            		        		+ "  \"phone\": \"77898778912\",\r\n"
		            		        		+ "  \"userStatus\": 0\r\n"
		            		        		+ "}")
						            .when()
						            .post("/user")
						            .then()
						            .extract()
						            .response();
		          String  resp=response.asPrettyString();
		          System.out.println(resp);
		          
		          JsonPath js = response.jsonPath();
		          messageValue = js.getString("message");
		          System.out.println(messageValue);
	}
	
	@Test(priority=2)
	public void getUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response response=given()
						.when()
						.get("/user/Ashy")
						.then()
						.extract()
						.response();
		String res = response.asPrettyString();
		System.out.println(res);
		JsonPath jsonResponse = response.jsonPath();
		idvalue = jsonResponse.getString("id");
		Assert.assertEquals(idvalue, messageValue);
		System.out.println(idvalue);
		
		
	}

}
