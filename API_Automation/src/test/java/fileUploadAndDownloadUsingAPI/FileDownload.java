package fileUploadAndDownloadUsingAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileDownload 
{
	@Test
	public void fileDownload() throws IOException
	{
		RestAssured.baseURI="https://the-internet.herokuapp.com";
		
		byte[] response = given()
						.log().all()
						.when()
						.get("/download/puppy_and_kitten.jpg")
						.then()
						.log().all()
						.extract()
						.response()
						.asByteArray();
		
		String path="C:\\Users\\OM\\Desktop\\New folder\\puppy_and_kitten.jpg";
		
		File file =new File(path);
		
		FileOutputStream output=new FileOutputStream(file);
		output.write(response);
		output.close();
		
	}

}
