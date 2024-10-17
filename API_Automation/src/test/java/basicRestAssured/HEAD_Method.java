package basicRestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.List;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HEAD_Method 
{
	@Test
	public void headMethod()
	{
		RestAssured.baseURI="https://api.getpostman.com";
	   Response	response=
			    given()
			   .header("x-api-key","PMAK-66310b77d0e2e1000198e183-a3b6ff3b40b3799c8fa068c98f467e319d")
			   .when()
			   .head("workspaces/")
			   .then()
			   .extract()
			   .response();
	   //below code will gives us the response in the string format
	 String res= response.asPrettyString();
	 System.out.println("Response is: "+res);
	 
	 //below code will give us the status code after hitting the request
	 int statusCode = response.getStatusCode();
	 System.out.println("Response Code is: "+statusCode);
	 
	 //below code will use to get the time which is taken to get the response
	 long responseTime = response.getTime();
	 System.out.println("Response time is: "+responseTime);
	 
   //To get the header information below code will be use but it will show all the headers present in the response
	 Headers header = response.headers();
	 System.out.println("Headers which are present: "+header);
	 
	 //to store the header value in the list format blow code will be use
	  List<Header> header_List = header.asList();
	  
	  //to get the attribute using the list we can not use index like aray we need to give value inside()
	  Header first_Header = header_List.get(0);//it will give us the header which is on 1st number likewise we can get all the header using parameter
	
	  //to find out key and value of above first_header we will use below code
	  String keyName = first_Header.getName();//this method will get the key of header
	  String keyValue = first_Header.getValue();//this method will give us value of above key header
	  System.out.println("value is:"+keyValue);
	  System.out.println("Name is:"+keyName);
	  	  
	  // if we know the header key then we can use below method to get the value of that header key
	 String header_value = response.getHeader(keyName);
	 System.out.println("Header Value is: "+ header_value);
	}

}
