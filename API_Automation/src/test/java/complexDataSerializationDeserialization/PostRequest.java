package complexDataSerializationDeserialization;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io. restassured.RestAssured;


public class PostRequest
{
	@Test
	public void post()
	{
		Category cat = new Category();
		cat.setId(0);
		cat.setName("string");
		List<String>photourl =new ArrayList<String>();
		photourl.add("string");
		
		Tags tag = new Tags();
		tag.setId(0);
		tag.setName("string");
		List<Tags>taglist =new ArrayList<Tags>();
		taglist.add(tag);
		
		PojoClassForPostRequest obj = new PojoClassForPostRequest();
		obj.setId(8);
		obj.setCategory(cat);
		obj.setName("doggie");
		obj.setPhotoUrls(photourl);
		obj.setTags(taglist);
		obj.setStatus("available");
		
		RestAssured.baseURI="https://petstore.swagger.io";
		 PojoClassForpostResponse response = given()
				 .header("content-Type","application/json")
				.body(obj)
				.log().all()
				.when()
				.post("/v2/pet")
				.then()
				.extract()
				.response().as(PojoClassForpostResponse.class);
		 Category1 categoryValue = response.getCategory();
		 String namevalue=categoryValue.getName();
		 System.out.println("nameValue:"+namevalue);
		 List<Tags1> TagsValue = response.getTags();
		 Tags1 tagvalue1 = TagsValue.get(0);
		 String tagvalue11 = tagvalue1.getName();
		 System.out.println(tagvalue11);
	}

}
