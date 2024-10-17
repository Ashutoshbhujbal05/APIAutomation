package basicRestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutMethodToUpdate 
{
	@Test
	public void putMethod()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		Response responce =
				 given()
	    		.header("x-api-key" , "PMAK-66310b77d0e2e1000198e183-a3b6ff3b40b3799c8fa068c98f467e319d")
	    		.body("{\r\n"
		    		  		+ "    \"workspace\": {\r\n"
		    		  		+ "        \"name\": \"My Workspace1\",\r\n"
		    		  		+ "        \"type\": \"personal\",\r\n"
		    		  		+ "        \"description\": \"Testing Purpose\"\r\n"
		    		  		+ "    }\r\n"
		    		  		+ "}")
	    		.when()
	    		.put("/workspaces/cd37e60e-63fc-444e-88b0-f296e1c11367")
	    		.then()
		        .extract()
		        .response();
		String res = responce.asPrettyString();
		System.out.println(res);
		int statusCode = responce.getStatusCode();
		long time = responce.getTime();
		System.out.println(time);
		System.out.println(statusCode);

	}

}
