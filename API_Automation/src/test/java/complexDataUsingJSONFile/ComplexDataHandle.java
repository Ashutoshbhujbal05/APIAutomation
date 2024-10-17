package complexDataUsingJSONFile;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ComplexDataHandle
{
	@Test
	public void payload() throws IOException, ParseException
	{
		JSONParser jsonparser=new JSONParser();//here we have created object of jsonparser class to parse the data
		
		FileReader filereader= new FileReader(".\\payload.json");//here we have created object of file reader class for setting the json file for handling purpose
		Object obj = jsonparser.parse(filereader);//here output will get in the form of java object but we need the output in JSONObject
		
		JSONObject obj1=(JSONObject)obj;//here we have perform typeCasting to convert java object to JSONObject
		
		String name = (String) obj1.get("name");//here perform type Casting because the output is in the form of java object and we need in the form of String to perform operation on it
		System.out.println(name);
        
        Object data_value = obj1.get("data");
        System.out.println(data_value);

	}

}
