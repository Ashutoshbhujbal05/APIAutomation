package takeLogFromRequestAndResponse;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;


public class Logs 
{
	@Test
	public void getLogsFromRequest()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		           given()
		           .log().all()
		           .header("x-api-key","PMAK-66310b77d0e2e1000198e183-a3b6ff3b40b3799c8fa068c98f467e319d")
		           .when()
		           .get(("/workspaces/"))
		           .then()
		           .log().all()
		           .extract()
		           .response();		
	}

}
