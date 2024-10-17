package requestCreatedOnPostmanMockServer;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class POST_Request 
{
	@Test
	public void postRequestMock()
	{
		
		HashMap <String,String> object= new HashMap <String,String>();
		object.put("name", "Ashutosh Bhujbal");
		object.put("message", "This is created For pratice purpose");
		object.put("Designation", "Test Engineer");
		
		HashMap <String,Object> bodyobject= new HashMap <String,Object>();
		bodyobject.put("UserDetails", object);


		RestAssured.baseURI="https://24eb8f3d-78d6-4550-ba2c-e5391eab4585.mock.pstmn.io";
		given()
		.body(bodyobject)
		.log().all()
		.when()
		.post("/document")
		.then()
		.log().all();
		
	}

}
