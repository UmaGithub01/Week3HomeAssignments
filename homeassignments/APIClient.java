package week3.homeassignments;

public class APIClient {
	public void sendRequest(String endpoint) {
	
		System.out.println("Calling method with single input "+endpoint);
	}
	public void sendRequest(String endpoint, String requestBody,String requestStatus) {
		
		System.out.println("Calling method with 3 arguments "+endpoint+" "+requestBody+" "+requestStatus);
	}
	public static void main(String[] args) {
		APIClient ap = new APIClient();
		ap.sendRequest("TestEndpoint");
		ap.sendRequest("TestEndpoint", "TestRequestBody", "TestRequestStatus");
	}
}


