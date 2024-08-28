package files;

import io.restassured.path.json.JsonPath;

public class ReUsableMethods {
	
	public static String testOutString()
	{
		System.out.println("Test string");
		

		return "test_stringgit";
	}
	
	public static JsonPath rawToJson(String response)
	{
		JsonPath js1 = new JsonPath(response);
		System.out.println("Web Automation");
		
		System.out.println("IOSApps");
		System.out.println("IOSApps");
		return js1;
	}

}
