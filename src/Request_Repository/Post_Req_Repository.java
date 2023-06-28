package Request_Repository;

public class Post_Req_Repository {
	
	public static String BaseURI() {
		String baseuri= "https://reqres.in/";
		return baseuri;
	}
	
	public static String Resource() {
		String resource = "api/users";
		return resource;
	}
	
	public static String RequestBody() {
		String requestbody= "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return requestbody;
	}

}
