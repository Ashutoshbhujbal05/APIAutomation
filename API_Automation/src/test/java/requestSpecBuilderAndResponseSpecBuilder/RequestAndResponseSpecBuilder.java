package requestSpecBuilderAndResponseSpecBuilder;

import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RequestAndResponseSpecBuilder 
{
	ResponseSpecification responseSpecification;
	RequestSpecification requestSpecification;
	
	@BeforeClass
	public void requestSpecBuilder()
	{
		RequestSpecBuilder requestSpecBuilder= new RequestSpecBuilder();
		requestSpecBuilder.setBaseUri("https://api.getpostman.com");
		requestSpecBuilder.addHeader("x-api-key","PMAK-66310b77d0e2e1000198e183-a3b6ff3b40b3799c8fa068c98f467e319d");
		requestSpecBuilder.log(LogDetail.ALL);
		requestSpecification = requestSpecBuilder.build();
		
        ResponseSpecBuilder responseSpecBuilder=new ResponseSpecBuilder();
        responseSpecBuilder.expectContentType(ContentType.JSON);
        responseSpecBuilder.expectStatusCode(200);
        responseSpecBuilder.log(LogDetail.ALL);
        responseSpecification = responseSpecBuilder.build();
	}
	
	@Test
	public void getWorkspace()
	{
		Response response=
						given()
						.spec(requestSpecification)
						.when()
						.get("/workspaces/")						
						.then()
						.spec(responseSpecification)
						.extract()
						.response();
//		String resp = response.asPrettyString();
//		System.out.println(resp);
	}

}
