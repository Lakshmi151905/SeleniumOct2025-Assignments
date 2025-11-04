package Week3.day2Assignments;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
		System.out.println("This method is used to perform Common Tasks from the Login Page Class");
	}

	public static void main(String[] args)  {
		LoginPage loginpage = new LoginPage();
		loginpage.performCommonTasks();
		loginpage.clickElement();
		loginpage.enterText();
		loginpage.findElement();
		
		
		BasePage Basepage = new BasePage();
		Basepage.performCommonTasks();
		Basepage.clickElement();
		Basepage.enterText();
		Basepage.findElement();
	

	}

}
