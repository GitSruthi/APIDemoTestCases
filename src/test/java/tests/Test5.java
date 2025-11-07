package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test5
{
	public final String uname="mynewgitrepo";
	public final String pwd="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";
	public String repoid;
	public String reponame;
	
	@Test
	public void deleteRecord()
	{
		RequestSpecification req=RestAssured.given();
		req.baseUri("https://jsonplaceholder.typicode.com"); //protocol with domain name
		req.basePath("posts/1"); //resources hierarchy
		req.header("Content-Type","application/json"); //header
		req.given().log().all();
	    Response res=req.delete();
		if(res.getStatusCode()==204)
	    {
	    	Reporter.log("Successful deletion of record"); 
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Reporter.log("Unsuccessful deletion of record");
	    	Assert.assertTrue(false);
	    }
	}
}
