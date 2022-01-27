package get_http_request_method;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.response.Response;

/*
     Given https://restful-booker.herokuapp.com/booking/3

        When user sends a GET request to the url

        Then HTTP status code should be 200

        And   content type should be Json 
        */

      

public class Get01 {
 
	 @Test
	 public void get01(){
	 	
		//1. set url
			
	    String url = "https://restful-booker.herokuapp.com/booking/3";
			
	   //2. set expected date
			
			
			
	  //3. send our request and get response
			
		Response response = given().when().get(url);	
	    
		response.prettyPrint();
		
	    //4. do assertions 
	   //hardassertion: if 1 failure stops
	   // soft assertion : 
	 
	   response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");	
		
		
	   }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
