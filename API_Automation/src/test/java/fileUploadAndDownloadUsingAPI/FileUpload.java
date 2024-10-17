package fileUploadAndDownloadUsingAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.File;
public class FileUpload
{
	@Test
	public void fileUpload()
	{
		String path = "C:\\Users\\OM\\Desktop\\New folder.png";
		File file =new File(path);
		
		RestAssured.baseURI="https://the-internet.herokuapp.com";
		given()
		.multiPart(file)
		.log().all()
		.when()
		.post("/upload")
		.then()
		.log().all();
		
	}

}
