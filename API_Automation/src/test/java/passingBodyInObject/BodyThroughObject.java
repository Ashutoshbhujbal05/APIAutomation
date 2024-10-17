package passingBodyInObject;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.RestAssured;

public class BodyThroughObject 
{
	@Test
	public void bodyViaObject()
	{
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("id", "0");
		map.put("username", "Ashutosh123");
		map.put("firstName", "Ashutosh");
		map.put("lastName", "Bhujba");
		map.put("email", "asn234@gmail.com");
		map.put("password", "asgh123");
		map.put("phone", "123456789");
		map.put("userStatus", "0");
		
		
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
							given()
							.body(map)
							.log().all()
							.when()
							.post("/user")
							.then()
							.log().all()
							.extract()
							.response();
	}

}
