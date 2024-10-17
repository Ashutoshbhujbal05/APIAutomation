package serializationAndDeseriallisationGetComplexData;

import static io.restassured.RestAssured.given;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojoClassMockExample.Category;
import pojoClassMockExample.MockPostRequestPojoClass;
import pojoClassMockExample.Tags;

public class MockPostRequestSerializationAndDeserialization
{
	@Test
	public void mockpostRequest()
	{
		Category cat = new Category();
		cat.setId(0);
		cat.setName("string");
		
		Tags tag = new Tags();
		tag.setId(0);
		tag.setName("anup");
		
		Tags tag1 = new Tags();
		tag.setId(1);
		tag.setName("ashutosh");
		
		Tags tag2 = new Tags();
		tag.setId(2);
		tag.setName("bhujbal");
		
		Tags tag3 = new Tags();	
		tag.setId(3);
		tag.setName("sharad");

		List<String>photoUrls=new ArrayList<String>();
		photoUrls.add("string");
		photoUrls.add("ashutosh");
		photoUrls.add("vishnu");
		photoUrls.add("soundhiya");
		
		//Here we have created the list of tags 
		List<Tags> tagsAll=new ArrayList<Tags>();
		tagsAll.add(tag);
		tagsAll.add(tag1);
		tagsAll.add(tag2);
		tagsAll.add(tag3);
		
		
		MockPostRequestPojoClass obj = new MockPostRequestPojoClass();
		obj.setId(0);
		obj.setCategory(cat);
		obj.setName("doggie");
		obj.setPhotoUrls(photoUrls);
//		obj.setTags(Arrays.asList(tag,tag1,tag2,tag3));here we can directly add list
		obj.setTags(tagsAll);
		obj.setStatus("available");
		
		RestAssured.baseURI="https://24eb8f3d-78d6-4550-ba2c-e5391eab4585.mock.pstmn.io";
		
		 MockPostRequestPojoClass response = given()
											.body(obj)
											.log().all()
											.when()
											.post("/document")
											.then()
											.log().all()
											.extract()
											.response().as(MockPostRequestPojoClass.class);
		 Category fullCategoryValue = response.getCategory();
		 Integer idValue = fullCategoryValue.getId();
		 System.out.println(idValue);
	}

}
