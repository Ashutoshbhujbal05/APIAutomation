package serializationAndDeserializationPost;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequest 
{
	@Test
	public void serializationRequest()
	{
		CreateRequestBody requestBody =new CreateRequestBody();
		requestBody.setId(0);
		requestBody.setUsername("ash1234");
		requestBody.setFirstName("ash");
		requestBody.setLastName("bhuj");
		requestBody.setEmail("ashbhujb@hotmail.com");
		requestBody.setPassword("pass@123");
		requestBody.setPhone("9878797867");
		requestBody.setUserStatus(0);
		
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		CreateResponseBody responseBody = 
				             given()
							.header("content-Type","application/json")
				            .body(requestBody)
				            .log().all()
							.when()
							.post("/user")
							.then()
							.log().all()
							.extract()
							.response().as(CreateResponseBody.class);
		Integer codeValue = responseBody.getCode();
		System.out.println("codeValue:"+codeValue);
		String typeValue=responseBody.getType();
		System.out.println("typeValue:"+typeValue);
		String messageValue=responseBody.getMessage();
		System.out.println("messageValue:"+messageValue);
	}

}
