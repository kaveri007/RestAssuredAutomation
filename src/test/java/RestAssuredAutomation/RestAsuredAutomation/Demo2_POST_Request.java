package RestAssuredAutomation.RestAsuredAutomation;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Demo2_POST_Request {
	
	public void registrationSuccessful()
	{
	
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RequestSpecification httprequest=RestAssured.given();
		
		JSONObject requestparams=new JSONObject();
		requestparams.put("FirstName","john");
		requestparams.put("LastName","xyzjohn");
		requestparams.put("UserName","johnxyz");
		requestparams.put("password","john");
		requestparams.put("Email","johnxyz@gmail.com");
		
				
	}

}
