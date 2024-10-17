package practiceBasicRestAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FetchTheComplexDataFromJson 
{
	@Test
	public void fetchDataFromJson()
	{
		RestAssured.baseURI="https://reqres.in";
		Response response=
				given()
				.when()
				.get("/api/users?page=2")
				.then()
				.extract()
				.response();
		String res = response.asPrettyString();
		System.out.println(res);
		JsonPath jsonData = response.jsonPath();
		 int pagevalue = jsonData.getInt("page");//it will fetch the value of page from json
		System.out.println(pagevalue);
		
		 int length = jsonData.getInt("data.size()");//it will fetch the size of data
		 System.out.println(length);
		 
		 //fetch the all json data from the data feild
		 
		 for(int i=0;i<length;i++)
		 {
			 String allfeildsofData = jsonData.getString("data["+i+"]");
			 System.out.println(allfeildsofData);
		 }
		 //fetch perticular value from the data
		 
		 for(int i=0;i<length;i++)
		 {
			 String all_firstName = jsonData.getString("data["+i+"].first_name");
			 System.out.println(all_firstName);
		 }
		 
		 //fetch the email which contains lastname Fields
		 
		 for(int i=0;i<length;i++)
		 {
			String last_name = jsonData.getString("data["+i+"].last_name");
			if(last_name.equals("Fields"))
			{
				String email = jsonData.getString("data["+i+"].email");
				System.out.println(email);
			}
		 }
		 
		 
		 
		 
		 
		
	}

	
	//below is the response from the above request
	/*
	 {
    "page": 2,
    "per_page": 6,
    "total": 12,
    "total_pages": 2,
    "data": [
        {
            "id": 7,
            "email": "michael.lawson@reqres.in",
            "first_name": "Michael",
            "last_name": "Lawson",
            "avatar": "https://reqres.in/img/faces/7-image.jpg"
        },
        {
            "id": 8,
            "email": "lindsay.ferguson@reqres.in",
            "first_name": "Lindsay",
            "last_name": "Ferguson",
            "avatar": "https://reqres.in/img/faces/8-image.jpg"
        },
        {
            "id": 9,
            "email": "tobias.funke@reqres.in",
            "first_name": "Tobias",
            "last_name": "Funke",
            "avatar": "https://reqres.in/img/faces/9-image.jpg"
        },
        {
            "id": 10,
            "email": "byron.fields@reqres.in",
            "first_name": "Byron",
            "last_name": "Fields",
            "avatar": "https://reqres.in/img/faces/10-image.jpg"
        },
        {
            "id": 11,
            "email": "george.edwards@reqres.in",
            "first_name": "George",
            "last_name": "Edwards",
            "avatar": "https://reqres.in/img/faces/11-image.jpg"
        },
        {
            "id": 12,
            "email": "rachel.howell@reqres.in",
            "first_name": "Rachel",
            "last_name": "Howell",
            "avatar": "https://reqres.in/img/faces/12-image.jpg"
        }
    ],
    "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }
}*/

}
