package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//LoginPageSuccessTest

public class TC_04{
	@Test
	public void get() {//First Test Case in Reqreshow to check if api returns only single record
		baseURI="https://reqres.in/api";
		given().
			header("x-api-key","reqres-free-v1").
			get("/unknown").
		then().
			statusCode(200).//check for status code
			body("data.size()",greaterThan(0)).
			body("data", everyItem(allOf(
		                hasKey("id"),
		                hasKey("name"),
		                hasKey("year"),
		                hasKey("color"))));
									
	}
}
