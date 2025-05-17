package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//LoginPageSuccessTest

public class TC_01{
	@Test
	public void get() {
		baseURI="https://reqres.in/api";
		given().
			header("x-api-key","reqres-free-v1").
			get("/users?page=2").
		then().
			statusCode(200).//check for status code
			body("data[4].first_name",equalTo("George")).//check if first name is George
			body("page",equalTo(2)).
			body("per_page",equalTo(6)).
			body("total",equalTo(12)).
			body("total_pages",equalTo(2));
									
	}
}
