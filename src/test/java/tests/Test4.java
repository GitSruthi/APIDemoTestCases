package tests;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test4
{
	public static void main(String[] args)
	{
		//Way-1: JSON file content as request body
		// Creating a File instance for JSON file 
		File f=new File("src\\test\\resources\\postdata1.json");
		//Create a HTTP request with body parameters
		RequestSpecification req=RestAssured.given();
		req.baseUri("https://jsonplaceholder.typicode.com"); //protocol with domain name
		req.basePath("posts/1"); //resources hierarchy
		req.header("Content-Type","application/json"); //header
		req.body(f); //body as .json file
		req.given().log().all();
	    //Submit Request via PATCH method
	    Response res=req.patch();
	    //Display whole Response
	    System.out.println(res.statusCode());
	}
}
