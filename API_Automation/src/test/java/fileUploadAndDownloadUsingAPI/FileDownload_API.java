package fileUploadAndDownloadUsingAPI;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import io. restassured.RestAssured;

public class FileDownload_API 
{
	@Test
	public void fileDownloadAPI() throws IOException
	{
		RestAssured.baseURI="https://the-internet.herokuapp.com";
						byte[] response = 
								given()
								.when()
								.post("/download/sample-zip-file.zip")
								.then()
								.extract()
								.response()
								.asByteArray();
						
						String path ="C:\\Users\\OM\\Desktop\\New folder\\Downloadedfile.zip";
						File file = new File(path);
						FileOutputStream os = new FileOutputStream(file);
						os.write(response);
						os.close();
						
	}

}
