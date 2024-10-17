package requestCreatedOnPostmanMockServer;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class GET_Request 
{
	@Test
	public void getMockRequest()
	{
		RestAssured.baseURI="https://c717fe7d-6b5a-4621-9bf9-d25596248a4a.mock.pstmn.io";
		given()
		.log().all()
		.when()
		.get()
		.then()
		.log().all();
	}

}
