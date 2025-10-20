package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Edit_Lead {

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
		driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).sendKeys("Test Leaf");

		//Enter the First name
		driver.findElement(By.xpath("//input[@id ='createLeadForm_firstName']")).sendKeys("Dhanalakshmi");

		//Enter the Last name
		driver.findElement(By.xpath("//input[@id ='createLeadForm_lastName']")).sendKeys("Panneerselvam");

		//Enter the First name (Local)
		driver.findElement(By.xpath("//input[@id ='createLeadForm_firstNameLocal']")).sendKeys("Dhana");

		//Enter the Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Quality");

		//Enter the Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Quality functions are analyzing, defining, and ensuring that requirements are set and met accordingly.");

		// Enter Email id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pretha.ss@gmail.com");

		//Select State/Province as NewYork using VisibleText
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		//Instantiating Select class
		Select option1= new Select(state);

		option1.selectByVisibleText("New York");


		//Click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();

		//Click on Edit Button
		driver.findElement(By.linkText("Edit")).click();

		//Clear the Description
		driver.findElement(By.id("updateLeadForm_description")).clear();

		//Enter Important Note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing the requirements vs Build System");

		//Click on Update button
		driver.findElement(By.name("submitButton")).click();


		//Print the title of the current web page
		System.out.println(driver.getTitle());

		//Close the Browser window
		driver.close();


	}

}
