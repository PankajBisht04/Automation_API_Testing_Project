package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

//LoginPageSuccessTest

public class TC_04{
	@Test
	public void put() {
		
		
		JSONObject request = new JSONObject();
		request.put("name", "Tester");
		request.put("job", "API tester");	
		
		baseURI="https://reqres.in/api";
		
		given().
			header("x-api-key","reqres-free-v1").
			body(request.toJSONString()).
		when().
			put("/users/2").
		then().
			statusCode(200);
	}
}
