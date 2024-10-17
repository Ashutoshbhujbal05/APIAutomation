package practiceBasicRestAssured;

public class DataForParsing
{
	public static String dataParsing()
	{
		String jsonData="{\r\n"
				+ " \"empid\": \"SJ011MS\",\r\n"
				+ " \"personal\":\r\n"
				+ "  {\r\n"
				+ "  \"name\":\"Smith Jones\",\r\n"
				+ "  \"gender\":\"Male\",\r\n"
				+ "  \"age\": 28,\r\n"
				+ "  \"address\":\r\n"
				+ "   {\r\n"
				+ "   \"streetaddress\":\"724th Street\",\r\n"
				+ "   \"city\":\"New York\",\r\n"
				+ "   \"state\": \"NY\",\r\n"
				+ "   \"postalcode\":\"10038\"\r\n"
				+ "   }\r\n"
				+ "  },\r\n"
				+ " \"profile\":\r\n"
				+ "  {\r\n"
				+ "  \"designation\":\"Deputy General\",\r\n"
				+ "  \"department\":\"Finance\"\r\n"
				+ "  }\r\n"
				+ "}";
		return jsonData;
	}

}
