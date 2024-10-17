package practiceBasicRestAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllUser 
{
	@Test
	public void getUsers()
	{
		RestAssured.baseURI="https://reqres.in";
		Response response=
				 given()
				.when()
				.get("/api/users?page=2")
				.then()
				.extract()
				.response();
		String resp = response.asPrettyString();
		int code = response.getStatusCode();
		long time = response.getTime();
		System.out.println(resp);
		System.out.println(code);
		System.out.println(time);

	}

}
