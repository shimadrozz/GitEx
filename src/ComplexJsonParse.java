import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(payload.CoursePrice());
		
		//Print Noof courses returned by API
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//Print Title of the first course
		String titleFirstCourse = js.getString("courses[0].title");
		System.out.println(titleFirstCourse);
		
	}

}
