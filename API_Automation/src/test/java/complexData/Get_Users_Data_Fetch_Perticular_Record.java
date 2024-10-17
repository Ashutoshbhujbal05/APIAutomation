package complexData;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.List;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Get_Users_Data_Fetch_Perticular_Record 
{
	@Test
	public void Get_Users_Data_And_Fetch_Perticular_Record()
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
		Headers header = response.headers();
		System.out.println("Heades:"+header);
		Header Perticular_Header = header.get("Content-Type");
		System.out.println("Perticular header:"+Perticular_Header);
		
        List<Header> list_headers = header.asList();
        Header fifth_Header = list_headers.get(5);
        String fifth_Header_Name = fifth_Header.getName();
        String fifth_Header_value=fifth_Header.getValue();
        System.out.println("fifth_Header:"+fifth_Header);
        System.out.println("fifth_Header_Name:"+fifth_Header_Name);
        System.out.println("fifth_Header_value:"+fifth_Header_value);
        System.out.println("Header_list:"+list_headers);
       int statusCode = response.getStatusCode();
       System.out.println("statusCode:"+statusCode);
      long Time_Response = response.getTime();
		JsonPath js=response.jsonPath();
		String email_Data = js.get("data[0].email");//this code is used to fetch the data from array 
        System.out.println("email_Data"+email_Data);


//if we have to assert the value of one field on behalf of another so below code will be use
          int length = js.getInt("data.size()");
          System.out.println("length of data:"+length);
          int length_support=js.getInt("support.size()");
          System.out.println("length_support:"+length_support);
          
        for(int i=0;i<length;i++)
        {
        	String first_name=js.getString("data["+i+"].first_name");
        	if(first_name.equals("Michael"))
        	{
        		String avatar=js.getString("data["+i+"].avatar");
        		System.out.println("Avatar:"+avatar);
        	}
        }
//
        for(int i=0;i<length;i++)
        {
        	 int id = js.getInt("data["+i+"].id");
        	if(id==7)
        	{
        		String first_name=js.getString("data["+i+"].first_name");
        		System.out.println("first_name:"+first_name);
        	}
        }
        
        for(int i=0;i<length;i++)
        {
     		String first_name=js.getString("data["+i+"].first_name");

        	if(first_name.equals("Lindsay"))
        	{
           	 int id = js.getInt("data["+i+"].id");

        		System.out.println("id:"+id);
        	}
        }
        
        for(int i=0;i<length;i++)
        {
     		String first_name=js.getString("data["+i+"].first_name");

        	if(first_name.equals("Lindsay"))
        	{
           	    String data_Value=js.getString("data["+i+"]");
        		System.out.println("data_Value:"+data_Value);
        	}
        }

		
	}
	/*{
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
    }*/
}

