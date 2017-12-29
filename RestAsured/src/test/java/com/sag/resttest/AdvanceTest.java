package com.sag.resttest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class AdvanceTest {
	@Test
	public void testCheck(){
		
		/*RestAssured.baseURI= "https://maps.googleapis.com";
		//Given is to take parameters
		//when() is to get response from the remaining url after base uri
		//then() is to do validation by aseerstion
		RestAssured.given().param("location", "-33.8670522,151.1957362").
		param("radius", "500").
		param("key", "AIzaSyBFtUbz3IV68YRqBaPsXuasawfMT4ySLQs").
		
		when().get("/maps/api/place/nearbysearch/json").
		
		then()
		.assertThat().statusCode(502)*/;
	}

}
