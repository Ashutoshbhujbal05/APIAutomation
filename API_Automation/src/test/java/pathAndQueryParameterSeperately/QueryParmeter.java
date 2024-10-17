package pathAndQueryParameterSeperately;
import static io.restassured.RestAssured.given;
import java.util.HashMap;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class QueryParmeter
{
	@Test
	public void getRequest()
	{
		HashMap <String,String> map =new HashMap<String,String>();
		map.put("page", "2");
		map.put("line", "5");

		RestAssured.baseURI="https://reqres.in";
		Response response= 
				 given()
//				.queryParam("page", "2")
//				.queryParam("page", "5")
				.queryParams(map)
                .log().all()
				.when()
				.get("/api/users")
				.then()
				.log().all()
				.extract()
				.response();
	}

}
