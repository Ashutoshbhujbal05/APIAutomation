package authenticationTypes;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BearerToken 
{
   @Test
   public void bearerTokenRequest()
   {
	   RestAssured.baseURI="https://api.github.com";
	   given()
	   .header("Authorization","Bearer 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")
	   .log().all()
	   .when()
	   .get("/user/repos")
	   .then()
	   .log().all()
	   .extract()
	   .response();
   }
}
