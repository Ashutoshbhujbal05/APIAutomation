package requestCreatedOnPostmanMockServer;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.restassured.RestAssured;

public class PostRequestForComplexData
{
	@Test
	public void postComplexRequest()
	{
		HashMap<String,Object> menuItem0 =new HashMap<String,Object>();
		menuItem0.put("value", "New");
		menuItem0.put("onclick", "CreateNewDoc()");
		
		HashMap<String,Object> menuItem1 =new HashMap<String,Object>();
		menuItem0.put("value", "Open");
		menuItem0.put("onclick", "OpenDoc()");

		HashMap<String,Object> menuItem2 =new HashMap<String,Object>();
		menuItem0.put("value", "Close");
		menuItem0.put("onclick", "CloseDoc()");

		List<HashMap<String,Object>> menuItemValue= new ArrayList<HashMap<String,Object>>();
		menuItemValue.add(menuItem0);
		menuItemValue.add(menuItem1);
		menuItemValue.add(menuItem2);
		
		HashMap<String,Object> menuItem=new HashMap<String,Object>();
		menuItem.put("menuitem", menuItemValue);		
		
		HashMap<String,Object> menuValue =new HashMap<String,Object>();
		menuValue.put("id", "file");
		menuValue.put("value", "file");
		menuValue.put("value", "file");
		menuValue.put("popup", menuItem);
	
		HashMap<String,Object> main=new HashMap<String,Object>();
		main.put("menu", menuValue);

		RestAssured.baseURI="https://24eb8f3d-78d6-4550-ba2c-e5391eab4585.mock.pstmn.io";
		given()
		.body(main)
		.log().all()
		.when()
		.post("/complexData")
		.then()
		.log().all();
	}

}
/*{"menu": {
"id": "file",
"value": "File",
"popup": {
  "menuitem": [
    {"value": "New", "onclick": "CreateNewDoc()"},
    {"value": "Open", "onclick": "OpenDoc()"},
    {"value": "Close", "onclick": "CloseDoc()"}
  ]
}
}}*/