package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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

						driver.findElement(By.linkText("Accounts")).click();

						//Click on Create Lead link from shortcut
						driver.findElement(By.linkText("Create Account")).click();
						
						//Enter Account Name
						driver.findElement(By.id("accountName")).sendKeys("Dhanalakshmi");
						
						//Enter the Description
						driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
						
						//Enter the number of Employees
						driver.findElement(By.id("numberEmployees")).sendKeys("10");
						
						//Enter the site Name
						driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
						
						//Click on Create Account Button
						driver.findElement(By.className("smallSubmit")).click();
						
						//Print the Title
						System.out.println(driver.getTitle());
						
						//close the browser
						driver.close();

	}

}
