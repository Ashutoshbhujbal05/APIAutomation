package complexJSONDataAddToHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MoreComplexDataToAddInHashMap 
{
	public static void main(String[] args)
	{
		HashMap<String,String>topping0=new HashMap<String,String>();
		topping0.put("id", "5001");
		topping0.put("type", "None");
		
		HashMap<String,String>topping1=new HashMap<String,String>();
		topping1.put("id", "5002");
		topping1.put("type", "Glazed");

		HashMap<String,String>topping2=new HashMap<String,String>();
		topping2.put("id", "5005");
		topping2.put("type", "Sugar");

		HashMap<String,String>topping3=new HashMap<String,String>();
		topping3.put("id", "5007");
		topping3.put("type", "Powdered Sugar");

		HashMap<String,String>topping4=new HashMap<String,String>();
		topping4.put("id", "5006");
		topping4.put("type", "Chocolate with Sprinkles");

		HashMap<String,String>topping5=new HashMap<String,String>();
		topping5.put("id", "5003");
		topping5.put("type", "Chocolate");

		HashMap<String,String>topping6=new HashMap<String,String>();
		topping6.put("id", "5004");
		topping6.put("type", "Maple");

        List<HashMap<String,String>> toppingValue =new ArrayList<HashMap<String,String>>();
        toppingValue.add(topping0);   
        toppingValue.add(topping1);
        toppingValue.add(topping2);
        toppingValue.add(topping3);
        toppingValue.add(topping4);
        toppingValue.add(topping5);
        toppingValue.add(topping6);
        
//        HashMap<String,Object> topping=new HashMap<String,Object>();
//        topping.put("topping", toppingValue);
      
		HashMap<String,String>batter0=new HashMap<String,String>();
		batter0.put("id", "1001");
		batter0.put("type", "Regular");
		
		HashMap<String,String>batter1=new HashMap<String,String>();
		batter1.put("id", "1002");
		batter1.put("type", "Chocolate");
		
		HashMap<String,String>batter2=new HashMap<String,String>();
		batter2.put("id", "1003");
		batter2.put("type", "Blueberry");

		HashMap<String,String>batter3=new HashMap<String,String>();
		batter3.put("id", "1004");
		batter3.put("type", "Devil's Food");

        List<HashMap<String,String>> batter =new ArrayList<HashMap<String,String>>();
        batter.add(batter0);
        batter.add(batter1);
        batter.add(batter2);
        batter.add(batter3);
        
        HashMap<String,Object>battersValue=new HashMap<String,Object>();
        battersValue.put("batter", batter);
        
        //Item0
        HashMap<String,Object>item0=new HashMap<String,Object>();
        item0.put("id", "0001");
        item0.put("type", "donut");
        item0.put("name", "Cake");
        item0.put("ppu", "0.55");
        item0.put("batters", battersValue);
        item0.put("topping", toppingValue);
//---------------------------------------------------------------------------------------------
		HashMap<String,String>topping00=new HashMap<String,String>();
		topping00.put("id", "5001");
		topping00.put("type", "None");
		
		HashMap<String,String>topping11=new HashMap<String,String>();
		topping11.put("id", "5002");
		topping11.put("type", "Glazed");

		HashMap<String,String>topping22=new HashMap<String,String>();
		topping22.put("id", "5005");
		topping22.put("type", "Sugar");

		HashMap<String,String>topping33=new HashMap<String,String>();
		topping33.put("id", "5003");
		topping33.put("type", "Chocolate");

		HashMap<String,String>topping44=new HashMap<String,String>();
		topping44.put("id", "5004");
		topping44.put("type", "Maple");



        List<HashMap<String,String>> toppingValue00 =new ArrayList<HashMap<String,String>>();
        toppingValue00.add(topping00);   
        toppingValue00.add(topping11);
        toppingValue00.add(topping22);
        toppingValue00.add(topping33);
        toppingValue00.add(topping44);

		HashMap<String,String>batter00=new HashMap<String,String>();
		batter00.put("id", "1001");
		batter00.put("type", "Regular");

        List<HashMap<String,String>> batterV =new ArrayList<HashMap<String,String>>();
        batterV.add(batter00);
        
		HashMap<String,Object>battersV=new HashMap<String,Object>();
		battersV.put("batter", batterV);
		
        //Item1
        HashMap<String,Object>item1=new HashMap<String,Object>();
        item1.put("id", "0002");
        item1.put("type", "donut");
        item1.put("name", "Raised");
        item1.put("ppu", "0.55");
        item1.put("batters", battersV);
        item1.put("topping", toppingValue00);
//---------------------------------------------------------------------------------------------

		HashMap<String,String>topping000=new HashMap<String,String>();
		topping000.put("id", "5001");
		topping000.put("type", "None");
		
		HashMap<String,String>topping111=new HashMap<String,String>();
		topping111.put("id", "5002");
		topping111.put("type", "Glazed");

		HashMap<String,String>topping222=new HashMap<String,String>();
		topping222.put("id", "5003");
		topping222.put("type", "Chocolate");

		HashMap<String,String>topping333=new HashMap<String,String>();
		topping333.put("id", "5004");
		topping333.put("type", "Maple");



        List<HashMap<String,String>> toppingValue000 =new ArrayList<HashMap<String,String>>();
        toppingValue000.add(topping000);   
        toppingValue000.add(topping111);
        toppingValue000.add(topping222);
        toppingValue000.add(topping333);

		HashMap<String,String>batter000=new HashMap<String,String>();
		batter000.put("id", "1001");
		batter000.put("type", "Regular");
		
		HashMap<String,String>batter111=new HashMap<String,String>();
		batter111.put("id", "1002");
		batter111.put("type", "Chocolate");

        List<HashMap<String,String>> batterVs =new ArrayList<HashMap<String,String>>();
        batterVs.add(batter000);
        batterVs.add(batter111);
        
		HashMap<String,Object>battersVs=new HashMap<String,Object>();
		battersVs.put("batter", batterVs);
		
        //Item2
        HashMap<String,Object>item2=new HashMap<String,Object>();
        item2.put("id", "0003");
        item2.put("type", "donut");
        item2.put("name", "Old Fashioned");
        item2.put("ppu", "0.55");
        item2.put("batters", battersVs);
        item2.put("topping", toppingValue000);
        
        List<HashMap<String,Object>> mainObject =new ArrayList<HashMap<String,Object>>(); 
        mainObject.add(item0);
        mainObject.add(item1);
        mainObject.add(item2);
        
        System.out.println(mainObject);

	}

}
