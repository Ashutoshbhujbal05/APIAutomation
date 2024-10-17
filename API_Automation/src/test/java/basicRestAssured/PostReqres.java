package basicRestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostReqres 
{
	@Test
	public void ReqresPost()
	{
		RestAssured.baseURI="https://reqres.in";
		Response response= given()
				.body("{\r\n"
						+ "    \"name\": \"Ansh\",\r\n"
						+ "    \"job\": \"QA\"\r\n"
						+ "}")
				.when()
				.post("/api/users")
				.then()
				.extract()
				.response();
		String res = response.asPrettyString();
		System.out.println(res);

	}

}
