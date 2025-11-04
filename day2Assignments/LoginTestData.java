package Week3.day2Assignments;


public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("Entered the username from LoginTestData Class");
	}

	public void enterPassword() {
		System.out.println("Entered the Password from LoginTestData Class");
	}

	public static void main(String[] args) {
		//Create objects for LoginTestData Class
		LoginTestData logintestdata = new LoginTestData();
		//Accessing methods from Login Test Data class
		logintestdata.enterUsername();
		logintestdata.enterPassword();

		//Accessing methods from TestData class
		logintestdata.enterCredentials();
		logintestdata.navigateToHomePage();

		//Create objects for TestData Class
		TestData testdata = new TestData();
		//Accessing methods from TestData class
		testdata.enterCredentials();
		testdata.navigateToHomePage();
	}

}
