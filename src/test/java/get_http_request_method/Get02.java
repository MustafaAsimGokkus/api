package get_http_request_method;

import baseUrls.HerokuappBaseUrl;
import io.restassured.response.Response;

   /*Given https://restful-booker.herokuapp.com/booking/1001
    When user sends a GET request to the url
    Then HTTP status code should be 404
    And   response body contains "Not Found"
    And status line should be HTTP/1.1 404 Not Found
    And body does not contain "techproed"
    And Server is "Cowboy"*/


public class Get02 extends HerokuappBaseUrl{

	
	
	public void get02 (){
      
		// 1. Set Url
		
		spec.pathParams("1st","booking","2nd",1001);
		
		//2. set expected data
		
		//3. Send request and get the response
		
		 Response resp = given().spec(spec).when().get("/{1st}/{2nd}");
		

    }

	




}