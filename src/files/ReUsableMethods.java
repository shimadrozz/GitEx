package files;

import io.restassured.path.json.JsonPath;

public class ReUsableMethods {
	
	public static JsonPath rawToJson(String response)
	{
		JsonPath js1 = new JsonPath(response);
		System.out.println("Web Automation");
		return js1;
	}

}
