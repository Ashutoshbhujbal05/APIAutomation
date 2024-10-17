package practiceBasicRestAssured;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class ComplexDataFromAnotherClass
{
	@Test
	public void dataAsObject()
	{
		JsonPath js = new JsonPath(DataForParsing.dataParsing());//here we are creating the object to get the data from another class which is complex data
		  Object allData = js.get();
		System.out.println(allData);
		//find out size of allData
		String adderssValue = js.getString("alldata[1].address");
		System.out.println(adderssValue);
		
		
		
		
		
	}
}
