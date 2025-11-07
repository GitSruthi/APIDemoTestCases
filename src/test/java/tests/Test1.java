package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test1 
{
	public static void main(String[] args) 
	{
		//1. Packing HTTP Request (serialisation)
		RequestSpecification req=RestAssured.given();
		req.baseUri("https://restcountries.com"); //protocol with domain name
		//2. Submit Request
		Response res=req.get();
		//3. Analyse HTTP response (deserialisation)
		System.out.println(res.statusCode());
		System.out.println(res.body().asPrettyString());
	}
}
