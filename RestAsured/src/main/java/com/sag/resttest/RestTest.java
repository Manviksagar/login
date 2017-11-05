package com.sag.resttest;

import io.restassured.RestAssured;

public class RestTest {
	
	public void testRest(){
	System.out.println(RestAssured.get("http://localhost:8888/RestProject/webapi/myresource").asString());
	}

}
