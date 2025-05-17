package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//LoginPageSuccessTest

public class TC_06{
	@Test
	public void get() {//First Test Case in Reqreshow to check if api returns only single record
		baseURI="https://reqres.in/api";
		given().
			header("x-api-key","reqres-free-v1").
			get("/users/23").
		then().
			statusCode(404);//check for status code					
	}
}
