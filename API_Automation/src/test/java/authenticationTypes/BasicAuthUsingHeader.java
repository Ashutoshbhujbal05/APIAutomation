package authenticationTypes;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class BasicAuthUsingHeader 
{
	@Test
	public void basicAuth()
	{
		RestAssured.baseURI="https://postman-echo.com";
		Response response=
				 given()
//				 .auth()
//				 .basic("postman", "password")
				 .header("Authorization","Basic cG9zdG1hbjpwYXNzd29yZA==")
				.when()
				.get("/basic-auth")
				.then()
				.log().all()
				.extract()
				.response();
		
	}

}
