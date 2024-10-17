package basicRestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PUT_Swagger_RequestToUpdate_User 
{
	@Test
	public void put_Swagger_Request()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		Response response=given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "  \"id\": 0,\r\n"
						+ "  \"username\": \"Ashut123\",\r\n"
						+ "  \"firstName\": \"string\",\r\n"
						+ "  \"lastName\": \"string\",\r\n"
						+ "  \"email\": \"string\",\r\n"
						+ "  \"password\": \"string\",\r\n"
						+ "  \"phone\": \"string\",\r\n"
						+ "  \"userStatus\": 0\r\n"
						+ "}")
				.when()
				.put("user/Ashut123")
				.then()
				.extract()
				.response();
		String res = response.asPrettyString();
		System.out.println("Response is:"+res);
		JsonPath js = response.jsonPath();
		int codeValue = js.getInt("code");
		String messageValue = js.getString("message");
		System.out.println("code Value:"+codeValue);
		System.out.println("message Value:"+messageValue);
		
	}

}
