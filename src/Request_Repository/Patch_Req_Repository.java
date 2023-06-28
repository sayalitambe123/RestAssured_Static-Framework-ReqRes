package Request_Repository;

public class Patch_Req_Repository {
	public static String BaseURI() {
		String baseuri= "https://reqres.in/";
		return baseuri;
	}
	
	public static String Resource() {
		String resource = "api/users/2";
		return resource;
	}
	
	public static String RequestBody() {
		String requestbody= "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		return requestbody;
	}

}
