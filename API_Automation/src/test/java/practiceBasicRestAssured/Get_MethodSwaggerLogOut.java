package practiceBasicRestAssured;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
public class Get_MethodSwaggerLogOut
{
	@Test
	public void logout()
	{
		RestAssured.baseURI="https://petstore.swagger.io";
		
	          Response  response= given()
								.when()
								.get("/v2/user/logout")
								.then()
								.extract()
								.response();
	          String res = response.asPrettyString();
	          System.out.println(res);
	          int code = response.getStatusCode();
	          String content = response.getContentType();
	         long time = response.getTime();
	         System.out.println(code);
	         System.out.println(content);
	         System.out.println(time);
	         
	        Headers headers = response.headers();
	        List<Header> list_Headers = headers.asList();
	        System.out.println(list_Headers);
	       Header first_header = list_Headers.get(0);
	       String key_first_header = first_header.getName();
	       String value_first_header = first_header.getValue();
	       System.out.println(first_header);
	       System.out.println(key_first_header);
	       System.out.println(value_first_header);
	       
	     String perticularHeader = response.getHeader("Content-Type");
	     System.out.println(perticularHeader);
				
	}

}
