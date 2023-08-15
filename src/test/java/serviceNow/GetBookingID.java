package serviceNow;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetBookingID extends BaseClass{
	
	@Test
	public void getBookingID() {
		//RestAssured.baseURI="https://restful-booker.herokuapp.com/booking/";
		Response response = RestAssured.given()
				.contentType("application/json")
				.get(bookid);
		
				
				 
		
	}

}
