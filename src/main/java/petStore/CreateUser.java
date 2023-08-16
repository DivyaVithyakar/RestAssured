package petStore;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUser {
	
	@Test
	public void createUser() {
		RestAssured.baseURI="https://petstore.swagger.io/v2/user";
		AuthBody authBody = new AuthBody(2, "Divya", "Divya", "Ram", "test@test.com","Test123", "1234557", 2);
		authBody.getid();
		authBody.getusername();
		authBody.getfirstName();
		authBody.getlastName();
		authBody.getemail();
		authBody.getpassword();
		authBody.getphone();
		authBody.getuserStatus();
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				.body(authBody)
				.log().all()
				.post();
		response.getStatusCode();
		
		
		
	}

}
