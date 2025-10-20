package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Delete_Lead {

	public static void main(String[] args) throws InterruptedException {
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

		//Click on Find Leads Link
		driver.findElement(By.linkText("Find Leads")).click();

		//Click on Phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		//Enter the phone Number
		driver.findElement(By.name("phoneNumber")).sendKeys("999");

		//Click on Find Leads button
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();

		Thread.sleep(3000);

		//Capture the first lead id

		String leadIDs= driver.findElement(By.xpath("//table/tbody/tr/td/div[contains(@ class,'x-grid3-cell-inner')]/a")).getText();

		System.out.println(leadIDs+": l2");

		//Click on the First Lead ID
		driver.findElement(By.xpath("//table/tbody/tr/td/div [contains(@ class,'x-grid3-cell-inner')]/a")).click();

		//Click on Delete
		driver.findElement(By.linkText("Delete")).click();

		//Click on Find Leads Link
		driver.findElement(By.linkText("Find Leads")).click();

		//Enter the Lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDs);

		//Click on Find Leads button
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();

		Thread.sleep(3000);

		//Verify No records to display message is present
		String message = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();	

		if (message.equalsIgnoreCase("No records to display")) {
			System.out.println("Successful Deletion of Lead");
		}
		else {
			System.out.println("Lead is not deleted");
		}

		//Close the browser
		driver.close();
	}


}
