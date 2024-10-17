package fileUploadAndDownloadUsingAPI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class FileUpload_API 
{
	@Test
	public void fileUploadAPI()
	{
		String path ="C:\\Users\\OM\\Desktop\\New folder\\puppy_and_kitten.jpg";
		File file = new File(path);
		
		RestAssured.baseURI="https://the-internet.herokuapp.com";
		      given()
		     .multiPart(file)
		     .log().all()
		     .when()
		     .post("/upload")
		     .then()
		     .log().all()
		     .extract()
		     .response();
	}

}
