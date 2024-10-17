package assertionInRestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class AssertionUsingHarmCrest 
{
	// we can apply assertion without getting the response form the response method with the help of macher assert class from hamcrest library
	@Test
	public void assertionHarmcrest()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		         given()
		         .header("x-api-key","PMAK-66310b77d0e2e1000198e183-a3b6ff3b40b3799c8fa068c98f467e319d")
		         .when()
		         .get("/workspaces/")
		         .then()
		         .assertThat()//it is a method of matcher assert class from the hamcrest library is is used to apply assertion
		         .contentType(ContentType.JSON)//it is a default method which is used to apply assertion on body that is which is the type of response
		         .statusCode(200)//it is used to apply assertion on response Status Code
		         .header("Connection", "keep-alive")//it is used to apply assertion on particular header of response
//		         .body("workspaces.name", contains("My Workspace1","API.Workspace","My Workspace1"))//it is used to apply assertion on response body but we have to give parameter in sequence as shown on JSON editor 
//		         .body("workspaces.name", containsInAnyOrder("My Workspace1","My Workspace1","API.Workspace"))//is it used to apply assertion on response body if we don't know the sequence of body data then we can use this
		         .body("workspaces.name", hasItem("My Workspace1")) //it is used to apply assertion on particular attribute of the response  
		         
		         .body("workspaces[1]",hasKey("name"))
		         .body("workspaces[1]",hasEntry("name","API.Workspace"));
		         
		         
	}
	

}
