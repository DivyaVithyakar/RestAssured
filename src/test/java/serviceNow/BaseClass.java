package serviceNow;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
	public static String bookid;
	
	@BeforeMethod
	public void setUp() {
	
	RestAssured.baseURI="https://restful-booker.herokuapp.com/";
	}

}
