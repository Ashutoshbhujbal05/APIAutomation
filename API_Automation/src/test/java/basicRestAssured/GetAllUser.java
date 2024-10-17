package basicRestAssured;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class GetAllUser
{
	@Test
	public void get_All_User()
	{
		RestAssured.baseURI="https://reqres.in";
		//Static import concept
		//method chaining
		
		 Response respon = given()
				.when()
				.get("/api/users?page=2")
				.then()
				.extract()
				.response();
		String res = respon.asPrettyString();
		System.out.println(res);
		int statusCode = respon.getStatusCode();
		long responceTime = respon.getTime();
		String statusLine = respon.getStatusLine();
		System.out.println(statusCode);
		System.out.println(responceTime);
		System.out.println(statusLine);

	}

}
