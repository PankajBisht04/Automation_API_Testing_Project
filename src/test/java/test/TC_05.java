package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

//LoginPageSuccessTest

public class TC_05{
	@Test
	public void put() {
		

		baseURI="https://reqres.in/api";
		
		given().
			header("x-api-key","reqres-free-v1").
		when().
			delete("/users/2").
		then().
			statusCode(204);
	}
}
