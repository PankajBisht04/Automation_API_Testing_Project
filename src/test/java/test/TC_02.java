package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

//LoginPageSuccessTest

public class TC_02{
	@Test
	public void post() {
		
		
		JSONObject request = new JSONObject();
		request.put("name", "Tester");
		request.put("job", "API tester");	
		
		baseURI="https://reqres.in/api";
		
		given().
			header("x-api-key","reqres-free-v1").
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201);
	}
}
