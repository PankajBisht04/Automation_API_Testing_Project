package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//LoginPageSuccessTest

public class TC_05{
	@Test
	public void get() {//First Test Case in Reqreshow to check if api returns only single record
		baseURI="https://reqres.in/api";
		given().
			header("x-api-key","reqres-free-v1").
			get("/unknown/2").
		then().
			statusCode(200).//check for status code
			body("data.size()",equalTo(5));
									
	}
}
