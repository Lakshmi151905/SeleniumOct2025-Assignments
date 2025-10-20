package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// Create an instance of ChromeOptions
		ChromeOptions option = new ChromeOptions();

		// Add argument to open Chrome in Guest Mode
		option.addArguments("--guest");

		//Instantiating the Browser(chrome) Driver
		ChromeDriver driver = new ChromeDriver(option);

		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");

		//Maximize the browser window
		driver.manage().window().maximize();

		//Enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//Enter Password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA Link

		driver.findElement(By.linkText("CRM/SFA")).click();		

		//Click on Leads Tab

		driver.findElement(By.linkText("Leads")).click();

		//Click on Create Lead link from shortcut
		driver.findElement(By.linkText("Create Lead")).click();

		//Enter the Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");

		//Enter the First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhanalakshmi");

		//Enter the Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Panneerselvam");

		//Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");

		//Click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();

		//Print the title of the current web page
		System.out.println(driver.getTitle());

		//Close the Browser window
		driver.close();


	}

}
