package basicRestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostAPIWorkspace 
{
	@Test
	public void CreateWorkspace()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		 Response response= given()
	    		  .header("x-api-key" , "PMAK-66310b77d0e2e1000198e183-a3b6ff3b40b3799c8fa068c98f467e319d")
	    		  .body("{\r\n"
	    		  		+ "    \"workspace\": {\r\n"
	    		  		+ "        \"name\": \"My Workspace1\",\r\n"
	    		  		+ "        \"type\": \"personal\",\r\n"
	    		  		+ "        \"description\": \"Testing Purpose\"\r\n"
	    		  		+ "    }\r\n"
	    		  		+ "}")
	    		  .when()
	    		  .post("/workspaces")
	    		  .then()
	    		  .extract()
	    		  .response();
		 String res = response.asPrettyString();
		 System.out.println(res);
	    		  
		
	}

}
