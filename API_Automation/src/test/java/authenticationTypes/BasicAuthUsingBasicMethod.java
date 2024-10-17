package authenticationTypes;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class BasicAuthUsingBasicMethod
{
	@Test
	public void basicAuth()
	{
		RestAssured.baseURI="https://postman-echo.com";
	    Response response=
	    		given()
	    		.auth()
	    		.basic("postman", "password")
	    		.when()
	    		.get("/basic-auth")
	    		.then()
	    		.log().all()
	    		.extract()
	    		.response();
	}

}
