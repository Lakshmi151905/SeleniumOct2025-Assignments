package week4.day1Assignments;

public class JavaConnection extends MySQLConnection implements DatabaseConnection{


	public void connect() {
		System.out.println(" Connected to the database");

	}


	public void disconnect() {
		System.out.println(" Disconnected from the database");

	}


	public void executeUpdate() {
		System.out.println(" Execution complete for an update in the database");

	}


	
	public void executeQuery() {
		System.out.println(" Executed Query in the database");
		
	}

}
