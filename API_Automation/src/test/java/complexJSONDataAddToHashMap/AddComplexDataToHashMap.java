package complexJSONDataAddToHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddComplexDataToHashMap
{
    public static void main(String[] args)
    {
    	
    	HashMap<String,Object> batter0 = new HashMap<String,Object>();
    	batter0.put("id", "1001");
    	batter0.put("type", "regular");
    	
        List<Integer>listID=new ArrayList<Integer>();
        listID.add(5);
        listID.add(9);

    	HashMap<String,Object> batter1 = new HashMap<String,Object>();
    	batter1.put("id", listID);
    	batter1.put("type", "Chocolate");
    	
        List<HashMap<String,Object>>Battermap=new ArrayList<HashMap<String,Object>>();
        Battermap.add(batter0);
        Battermap.add(batter1);

        
    	HashMap<String,Object> battersmap = new HashMap<String,Object>();
    	battersmap.put("batter", Battermap);
    	
    	HashMap<String,String> topping0 = new HashMap<String,String>();
    	topping0.put("id", "5001");
    	topping0.put("type", "None");

    	HashMap<String,String> topping1 = new HashMap<String,String>();
    	topping1.put("id", "5002");
    	topping1.put("type", "Glazed");

    	HashMap<String,String> topping2 = new HashMap<String,String>();
    	topping2.put("id", "5005");
    	topping2.put("type", "Sugar");
    	
    	List<HashMap<String,String>> toppingvalue=new ArrayList<HashMap<String,String>>();
    	toppingvalue.add(topping0);
    	toppingvalue.add(topping1);
    	toppingvalue.add(topping2);
    	
    	HashMap<String,Object> main = new HashMap<String,Object>();
    	main.put("ppu", "0.55");
    	main.put("batters", battersmap);
    	main.put("name", "Cake");
    	main.put("id", "0001");
    	main.put("type", "donut");
    	main.put("topping", toppingvalue);
    	System.out.println(main);

// Below is the data which is stored in above hashmap
/*    	{
    	    "ppu": 0.55,
    	    "batters": {
    	        "batter": [
    	            {
    	                "id": "1001",
    	                "type": "regular"
    	            },
    	            {
    	                "id": [
    	                    5,
    	                    9
    	                ],
    	                "type": "Chocolate"
    	            }
    	        ]
    	    },
    	    "name": "Cake",
    	    "id": "0001",
    	    "type": "donut",
    	    "topping": [
    	        {
    	            "id": "5001",
    	            "type": "None"
    	        },
    	        {
    	            "id": "5002",
    	            "type": "Glazed"
    	        },
    	        {
    	            "id": "5005",
    	            "type": "Sugar"
    	        }
    	    ]
    	}
*/
	}
}
