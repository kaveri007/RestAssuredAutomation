package RestAssuredAutomation.RestAsuredAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Demo1_Get_Request {

	@Test
	public void getWeatherDetails()
	{
		
		//specify base uri
		
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		//request object when ever we want to send request we use below lie.
		RequestSpecification httprequest= RestAssured.given();
		 
		//response object(once we send request we get responce to store responce use below line code)
		Response response=httprequest.request(Method.GET,"/Hyderabad");
		
		//to print response in console window
		String responsebody=response.getBody().asString();
		System.out.println("response body is:"+responsebody);
		
		//status code capture for validation
		
		int statuscode=response.getStatusCode();
		System.out.println("status code is:"+statuscode);
		
		//verifying status code
		Assert.assertEquals(statuscode, 200);
		
		//status line verification
		
		String statusline=response.getStatusLine();
	    System.out.println("status line is:"+statusline);
	    Assert.assertEquals(statusline, "HHTP/1.1 200 OK");
	
	}
}
