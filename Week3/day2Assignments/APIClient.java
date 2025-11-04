package Week3.day2Assignments;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint for this send Request is : "+endpoint);
		
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint for this send Request is : "+endpoint);
		System.out.println("Request Body for this send Request is : "+requestBody);
		System.out.println("Request Status for this send Request is : "+requestStatus);
	}

	public static void main(String[] args) {
		
		APIClient apiclient = new APIClient();
		apiclient.sendRequest("Test-leaf");
		apiclient.sendRequest("Test-leaf", "Json-body", true);

	}

}