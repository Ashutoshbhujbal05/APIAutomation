package basicRestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetWorkspaces 
{
	@Test
	public void getAllWorkspaces()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		     Response response=given()
		    		  .header("x-api-key" , "PMAK-66310b77d0e2e1000198e183-a3b6ff3b40b3799c8fa068c98f467e319d")
		    		  .when()
		    		  .get("/workspaces/")
		    		  .then()
		    		  .extract()
		    		  .response();
		     String resp =response.asPrettyString();
		     System.out.println(resp);
		     
	}

}
