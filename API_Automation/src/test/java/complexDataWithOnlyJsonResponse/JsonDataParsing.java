package complexDataWithOnlyJsonResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonDataParsing 
{
	@Test
	public void handle_Complex_Data()
	{

		JsonPath js = new JsonPath(StoreJsonData.JsonData());
		System.out.println(StoreJsonData.JsonData());
		//Q1-Print No of courses returned by API
		int length = js.getInt("courses.size()");
		System.out.println("Number of courses by API:"+length);
		
		//2. Print Purchase Amount
		int purchase_Amount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount:"+purchase_Amount);
		
		//3. Print Title of the first course
		String title_of_first_course = js.getString("courses[0].title");
		System.out.println("Title of first course:"+title_of_first_course);
		
		//4. Print All course titles and their respective Prices
		
		for(int i=0;i<length;i++)
		{
			String title = js.getString("courses["+i+"].title");
			int prices=js.getInt("courses["+i+"].price");
			System.out.println("course:"+title+":"+"Price of that course:"+prices);

		}
		//5. Print no of copies sold by RPA Course
		for(int i=0;i<length;i++)
		{
			String title = js.getString("courses["+i+"].title");
			if(title.equals("RPA"))
			{
				int copies_sold = js.getInt("courses["+i+"].copies");
				System.out.println("Copies Sold By RPA Course:"+copies_sold);
			}

		}

		//6. Verify if Sum of all Course prices matches with Purchase Amount
		int sum=0;
		for(int i=0;i<length;i++)
		{		
			int prices=js.getInt("courses["+i+"].price");
			sum=sum+prices;
			i++;
		}
        System.out.println("Sum of Prices:"+sum);
        Assert.assertEquals(purchase_Amount, sum,"Two amount are not equal");
		
	}

}
