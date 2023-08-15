package serviceNow;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateBooking extends BaseClass {
	
	@Test
	public void createBooking() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		//RestAssured.basePath="booking";
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.body("{\n"
						+ "    \"firstname\" : \"Vithya\",\n"
						+ "    \"lastname\" : \"DivyaRam\",\n"
						+ "    \"totalprice\" : 111,\n"
						+ "    \"depositpaid\" : true,\n"
						+ "    \"bookingdates\" : {\n"
						+ "        \"checkin\" : \"2022-12-01\",\n"
						+ "        \"checkout\" : \"2022-12-04\"\n"
						+ "    },\n"
						+ "    \"additionalneeds\" : \"Dinner Added\"\n"
						+ "}")
				.post();
	
		 bookid = response.jsonPath().get("bookingid");
		 System.out.println(bookid);
		 response.then().assertThat().body("booking.firstname", Matchers.contains("Vithya"));
		
		
	}
	
	
	@Test
	public void getBooking() {
RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.get(bookid);
		System.out.println(response.getStatusCode());
		response.then().assertThat().statusCode(200);
		
		
	}
	
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
					response.then().assertThat().body("booking.additionalneeds", Matchers.contains("Dinner Removed"));
		
		
		
	}
	
	@Test
	public void deleteBooking() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.delete(bookid);
				
		
		
		
	}
	

}
