package serializationAndDeseriallisationGetComplexData;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.List;

import pojoClasses.Category;
import pojoClasses.CreateResponsebody;

public class GET_Pet_By_Id 
{
	@Test
	public void getPetById()
	{
		RestAssured.baseURI="https://petstore.swagger.io";
		
			 CreateResponsebody responseBody = 
											given()
											.when()
											.get("/v2/pet/5")
											.then()
											.extract()
											.response().as(CreateResponsebody.class);
			 Category categoryValue = responseBody.getCategory();//name value from category 
			 Integer idValue = categoryValue.getId();
			 System.out.println(idValue);
			 List<String> urls = responseBody.getPhotoUrls();
	}

}
