package tests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test2 
{
	public static void main(String[] args) 
	{
		//1. Packing Request (serialisation)
		RequestSpecification req=RestAssured.given();
		req.baseUri("https://restcountries.com"); //protocol with domain name
		req.basePath("v3.1/name/india"); //resource hierarchy with path parameter
		req.queryParam("fullText","true"); //query parameter
		//2. Submit Request
		Response res=req.get();
		//3. Analyse response (deserialisation)
		System.out.println(res.statusCode());
		System.out.println(res.body().asPrettyString());
	}
}
