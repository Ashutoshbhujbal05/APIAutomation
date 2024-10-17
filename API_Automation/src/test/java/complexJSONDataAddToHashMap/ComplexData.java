package complexJSONDataAddToHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComplexData 
{
	public static void main(String[] args) 
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
//		System.out.println(menuItem);		
		
		HashMap<String,Object> menuValue =new HashMap<String,Object>();
		menuValue.put("id", "file");
		menuValue.put("value", "file");
		menuValue.put("value", "file");
		menuValue.put("popup", menuItem);
//		
		HashMap<String,Object> main=new HashMap<String,Object>();
		main.put("menu", menuValue);
		System.out.println(main);
		
		
		//Below is the data for handling Purpose
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
	}}
*/
	
		
		
		
		
	}

}
