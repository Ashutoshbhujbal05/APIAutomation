package practiceBasicRestAssured;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PathParameterThroughMethod 
{
	@Test
	public void pathParameter()
	{
		RestAssured.baseURI="https://reqres.in";
		Response response=given()
				          .pathParam("api", "api")
				          .pathParam("users", "users")
				          .pathParam("user", "2")
				          .log().all()
				          .when()
				          .get("/{api}/{users}/{user}")
				          .then()
				          .log().all()
				          .extract()
				          .response();
	}

}
