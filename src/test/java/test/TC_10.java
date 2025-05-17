package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

//LoginPageSuccessTest

public class TC_10{
	@Test
	public void delete() {
		

		baseURI="https://reqres.in/api";
		
		given().
			header("x-api-key","reqres-free-v1").
		when().
			delete("/users/2").
		then().
			statusCode(204);
	}
}
