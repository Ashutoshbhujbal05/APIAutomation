package complexDataWithOnlyJsonResponse;

public class ExampleJsonData 
{		
	public static String jsondata()
    {
		String data1="{ \r\n"
				+ "  \"accounting\" : [   \r\n"
				+ "                     { \"firstName\" : \"John\",  \r\n"
				+ "                       \"lastName\"  : \"Doe\",\r\n"
				+ "                       \"age\"       : 23 },\r\n"
				+ "\r\n"
				+ "                     { \"firstName\" : \"Mary\",  \r\n"
				+ "                       \"lastName\"  : \"Smith\",\r\n"
				+ "                        \"age\"      : 32 }\r\n"
				+ "                 ],                            \r\n"
				+ "  \"sales\"      : [ \r\n"
				+ "                     { \"firstName\" : \"Sally\", \r\n"
				+ "                       \"lastName\"  : \"Green\",\r\n"
				+ "                        \"age\"      : 27 },\r\n"
				+ "\r\n"
				+ "                     { \"firstName\" : \"Jim\",   \r\n"
				+ "                       \"lastName\"  : \"Galley\",\r\n"
				+ "                       \"age\"       : 41 }\r\n"
				+ "                 ] \r\n"
				+ "} ";
			return data1;
}


}
