package passingBodyInObject;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.RestAssured;

public class BodyThroughObject1 
{
	@Test
	public void objectBody()
	{
		HashMap <String,String> map = new HashMap <String,String>();
		map.put("name", "Body");
		map.put("type", "personal");
		map.put("description", "it is used for Api Automation");
		
		HashMap <String,Object> object = new HashMap <String,Object>();
		object.put("workspace", map);

		RestAssured.baseURI="https://api.getpostman.com";
		
		given()
	    .header("x-api-key" , "PMAK-66310b77d0e2e1000198e183-a3b6ff3b40b3799c8fa068c98f467e319d")
	    .log().all()
		.body(object)
		.when()
		.post("/workspaces")
		.then()
		.log().all()
		.extract()
		.response();
	}

}
