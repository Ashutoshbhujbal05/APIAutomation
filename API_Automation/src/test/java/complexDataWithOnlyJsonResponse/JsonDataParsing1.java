package complexDataWithOnlyJsonResponse;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonDataParsing1 
{

	@Test
	public void parsingJsonData()
	{
		JsonPath js = new JsonPath(ExampleJsonData.jsondata());
		
		//find out the age of accounting where name is "Mary" using JSON data
		
		String accounting = js.getString("accounting");
		int length= js.getInt("accounting.size()");
		System.out.println("Length of accounting:"+length);
		System.out.println("accounting:"+accounting);

		for(int i=0;i<length;i++)
		{
			String firstname = js.getString("accounting["+i+"].firstName");
			if(firstname.equals("Mary"))
			{
				int age=js.getInt("accounting["+i+"].age");
				System.out.println("age of "+firstname+" "+"is:"+age);
			}
		}
		
		// find out all firstName in sales
		
		int length_sales = js.getInt("sales.size()");
		System.out.println("Length of Sales is:"+length_sales);
		 
		String sales=js.getString("sales");
		System.out.println("Values in sales:"+sales);
		
		for(int i=0;i<length_sales;i++)
		{
			String firstname=js.getString("sales["+i+"].firstName");
			int age =js.getInt("sales["+i+"].age");
			System.out.println("Name:"+firstname+"And age:"+age);
		}
			
		
	}

}
