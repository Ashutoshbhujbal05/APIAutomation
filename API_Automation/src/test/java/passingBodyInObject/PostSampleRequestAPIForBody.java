package passingBodyInObject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PostSampleRequestAPIForBody 
{
	@Test
	public void postSampleForBody()
	{
		HashMap <String,String> map =new HashMap<String,String>();
		map.put("name", "Apple MacBook Pro 16");
		
		HashMap <String,String> object1 =new HashMap<String,String>();
		object1.put("year", "2019");
		object1.put("price", "1849.99");
		object1.put("CPU model", "Intel Core i9");
		object1.put("Hard disk size", "1 TB");
		
		HashMap <String,Object> obj =new HashMap<String,Object>();
		obj.put("data", object1);
				



		RestAssured.baseURI="https://api.restful-api.dev";
		        given()
		        .log().all()
		        .body(obj)
		        .when()
		        .post("/objects")
		        .then()
		        .log().all()
		        .extract()
		        .response();
	}

}
