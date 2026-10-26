package com.online.products;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class ProductTests {
	
	@Test(priority = 1)
	public void testGetAllProducts() {
		
		System.out.println("*********** Started:Test Case: Get All Products **********");
		
		given()
			.contentType("application.json")
			
		.when()
			.get("https://dummyjson.com/products")
		.then() 
			.log().body()
			.statusCode(200);
		System.out.println("*********** Ended:Test Case: Get All Products **********");
		
	}
	
	@Test(priority = 1)
	public void testGetByIdProducts() {
		
		
		System.out.println("*********** Started:Test Case: Get By Id Products **********");
		
		given()
			.contentType("application.json")
			
		.when()
			.get("https://dummyjson.com/products")
		.then() 
			.log().body()
			.statusCode(200);
		System.out.println("*********** Ended:Test Case: Get By Id Products **********");
		
	}


}
