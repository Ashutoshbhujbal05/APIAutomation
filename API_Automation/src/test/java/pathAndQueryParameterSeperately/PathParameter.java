package pathAndQueryParameterSeperately;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class PathParameter 
{
	@Test
	public void pathParameter()
	{
		RestAssured.baseURI="https://reqres.in";
		       given()
		       .pathParam("user","2")
		       .log().all()
		       .when()
		       .get("/api/users/{user}")
		       .then()
		       .log().all()
		       .extract()
		       .response();
		       
	}

}
