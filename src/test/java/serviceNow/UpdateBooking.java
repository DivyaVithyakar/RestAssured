package serviceNow;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateBooking extends BaseClass{

	
	@Test
	public void updateBooking() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.body("{\n"
						+ "        \"firstname\": \"Vithya\",\n"
						+ "        \"lastname\": \"DivyaRam\",\n"
						+ "        \"totalprice\": 101,\n"
						+ "        \"depositpaid\": true,\n"
						+ "        \"bookingdates\": {\n"
						+ "            \"checkin\": \"2022-12-01\",\n"
						+ "            \"checkout\": \"2022-12-04\"\n"
						+ "        },\n"
						+ "        \"additionalneeds\": \"Dinner Removed\"\n"
						+ "    }")
				.put(bookid);
		response.prettyPrint();
		response.then().assertThat().body("booking.additionalneeds", Matchers.contains("Dinner Removed"));
		
		
		
		
		
	}
}
