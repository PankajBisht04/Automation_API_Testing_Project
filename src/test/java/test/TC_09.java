package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

//LoginPageSuccessTest

public class TC_09{
	@Test
	public void patch() {
		
		
		JSONObject request = new JSONObject();
		request.put("name", "Tester");
		request.put("job", "API tester");	
		
		baseURI="https://reqres.in";
		
		given().
			header("x-api-key","reqres-free-v1").
			body(request.toJSONString()).
		when().
			patch("/api/users/2").
		then().
			statusCode(200);
	}
}
