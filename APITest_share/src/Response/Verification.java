package Response;

import com.google.gson.Gson;



public class Verification {

	public static void main(String[]args) throws Exception {
	String response="{\"status\": \"SUCCESS\",\"errorList\": null,\"message\": null,\"fieldErrors\": null,\"response\": {\"rootCompanyName\": \"IRIS gst dev\",\"companyid\": 2,\"isValidPassword\": true,\"passWordExpiredDate\": \"2018-04-14\",\"companyname\": \"IRIS gst dev\",\"rootCompanyid\": \"2\",\"email\": \"amit.nandha@irisindia.net\",\"parentid\": \"0\",\"token\": \"AmitNandhaxyzdemo\",\"username\": \"Amit\"}}";

	Gson gson = new Gson();

	// De-serializaton 
	MainClass responseObj = gson.fromJson(response, MainClass.class);
	System.out.println(responseObj);

	//This Will display "ErrorList" attribute
	System.out.println("ErrorList:-" +responseObj.getErrorList());
		
	//This Will display "FieldErrors" attribute
	System.out.println("FieldErrors:-" +responseObj.getFieldErrors());
	
	//This Will display "Message" attribute
	System.out.println("Message:-" +responseObj.getMessage());
	
	//This Will display "Status" attribute
	System.out.println("Status:-" +responseObj.getStatus());
	
	// This Will display "RootCompanyName" attribute
	System.out.println("RootCompanyName:-" +responseObj.getResponse().getRootCompanyName());
	
	//This Will display "RootCompanyid" attribute
	System.out.println("RootCompanyid" +responseObj.getResponse().getRootCompanyid());
	
	//This Will display "IsValidPassword" attribute
	System.out.println("IsValidPassword" +responseObj.getResponse().getIsValidPassword());
	
	//This Will display "PassWordExpiredDate" attribute
	System.out.println("PassWordExpiredDate" +responseObj.getResponse().getPassWordExpiredDate());
	
	//This Will display "Companyname" attribute
	System.out.println("Companyname" +responseObj.getResponse().getCompanyname());
	
	//This Will display "RootCompanyid" attribute
	System.out.println("RootCompanyid" +responseObj.getResponse().getRootCompanyid());
	
	//This Will display "Email" attribute
	System.out.println("Email" +responseObj.getResponse().getEmail());
	
	//This Will display "Parentid" attribute
	System.out.println(responseObj.getResponse().getParentid());
	
	//This Will display "Token" attribute
	System.out.println(responseObj.getResponse().getToken());
	
	//This Will display "Username" attribute
	System.out.println(responseObj.getResponse().getUsername());
}
}