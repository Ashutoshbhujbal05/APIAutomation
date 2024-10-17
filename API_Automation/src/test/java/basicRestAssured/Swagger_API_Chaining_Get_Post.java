package basicRestAssured;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Swagger_API_Chaining_Get_Post 
{
    static String idvalue;
	static String messagevalue;
	@Test
	public void CreateUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		Response response=given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "  \"id\": 0,\r\n"
						+ "  \"username\": \"Asst1223\",\r\n"
						+ "  \"firstName\": \"hujjj\",\r\n"
						+ "  \"lastName\": \"ashk\",\r\n"
						+ "  \"email\": \"huja123123@gmail.com\",\r\n"
						+ "  \"password\": \"hgdyt12\",\r\n"
						+ "  \"phone\": \"76543234\",\r\n"
						+ "  \"userStatus\": 0\r\n"
						+ "}")
				.when()
				.post("/user")
				.then()
				.extract()
				.response();
        JsonPath js = response.jsonPath();
        String responce = response.asPrettyString();
        System.out.println(responce);
         messagevalue = js.getString("message");
        System.out.println("msg:"+messagevalue);
        
	}
	@Test
	public void getUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		Response response=given()
				.when()
				.get("/user/Asst1223")
				.then()
				.extract()
				.response();
        JsonPath js = response.jsonPath();
        String responce = response.asPrettyString();
        System.out.println(responce);
         idvalue = js.getString("id");
        System.out.println("id:"+idvalue);
        Assert.assertEquals(idvalue, messagevalue);
        
	}


}