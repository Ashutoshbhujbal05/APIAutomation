package practiceBasicRestAssured;
import org.testng.annotations.Test;
import static io. restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class PostCreateUser
{
	@Test
	public void createUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io";
		Response response=given()
							.body("{\r\n"
									+ "  \"id\": 0,\r\n"
									+ "  \"username\": \"string\",\r\n"
									+ "  \"firstName\": \"string\",\r\n"
									+ "  \"lastName\": \"string\",\r\n"
									+ "  \"email\": \"string\",\r\n"
									+ "  \"password\": \"string\",\r\n"
									+ "  \"phone\": \"string\",\r\n"
									+ "  \"userStatus\": 0\r\n"
									+ "}")
							.log().all()
							.when()
							.post("/v2/user")
							.then()
							.log().all()
							.extract()
							.response();
		String resp=response.asPrettyString();
		System.out.println(resp);
	}

}
