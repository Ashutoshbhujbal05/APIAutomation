package practiceBasicRestAssured;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class QueryParameterThroughMethod 
{
	@Test
	public void queryParameter()
	{
			RestAssured.baseURI="https://reqres.in";
			Response response=given()
					        .queryParam("page", "2")
					        .log().all()
							.when()
							.get("/api/users")
							.then()
							.log().all()
							.extract()
							.response();
	}

}
