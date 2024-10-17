package basicRestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SwaggerUICreateUser 
{
	@Test
	public void post_User_Swagger()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		Response response=given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "  \"id\": 0,\r\n"
						+ "  \"username\": \"Ashut123\",\r\n"
						+ "  \"firstName\": \"huj\",\r\n"
						+ "  \"lastName\": \"ash\",\r\n"
						+ "  \"email\": \"hujash123.gmail.com\",\r\n"
						+ "  \"password\": \"hgdyt12\",\r\n"
						+ "  \"phone\": \"76543234\",\r\n"
						+ "  \"userStatus\": 0\r\n"
						+ "}")
				.when()
				.post("/user")
				.then()
				.extract()
				.response();
		String res = response.asPrettyString();
		System.out.println("Response is:"+res);
		 Headers header = response.headers();
		 System.out.println(header);
		 JsonPath js = response.jsonPath();
		 System.out.println("jsonPath:"+js);
		 
		 int codeValue = js.getInt("code");
		 String messageValue = js.getString("message");
		 System.out.println("Code value:"+codeValue);
		 System.out.println("messageValue:"+messageValue);
				
	}

}
