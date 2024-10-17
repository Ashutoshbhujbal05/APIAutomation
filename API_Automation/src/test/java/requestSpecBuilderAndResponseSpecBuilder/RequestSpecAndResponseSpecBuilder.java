package requestSpecBuilderAndResponseSpecBuilder;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class RequestSpecAndResponseSpecBuilder 
{
	RequestSpecification requestspecification;
	ResponseSpecification responsespecification;
	
	@BeforeClass
	public void reqAndResSpecBuilder()
	{
		RequestSpecBuilder requestspecbuilder = new RequestSpecBuilder();
		requestspecbuilder.setBaseUri("https://api.getpostman.com");
		requestspecbuilder.setBasePath("/workspaces/");
		requestspecbuilder.addHeader("x-api-key", "PMAK-66310b77d0e2e1000198e183-a3b6ff3b40b3799c8fa068c98f467e319d");
		requestspecbuilder.log(LogDetail.ALL);
	    requestspecification=requestspecbuilder.build();
		
		ResponseSpecBuilder responsespecbuilder = new ResponseSpecBuilder();
		responsespecbuilder.expectStatusCode(200);
		responsespecbuilder.expectContentType(ContentType.JSON);
		responsespecification = responsespecbuilder.build();
	}
	
	@Test
	public void getMethodForReqAndResponseSpecBuilder()
	{
		given()
		.spec(requestspecification)
		.when()
		.get()
		.then()
		.spec(responsespecification);
		
		
	}

}
