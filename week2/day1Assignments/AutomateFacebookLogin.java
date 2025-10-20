package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomateFacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		

		// Create an instance of ChromeOptions
		ChromeOptions option = new ChromeOptions();

		// Add argument to open Chrome in Guest Mode
		option.addArguments("--guest");
		
		//Instantiating the Browser(chrome) Driver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url of Facebook
		driver.get("https://www.facebook.com/");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//Enter the email id 
		driver.findElement(By.id ("email")).sendKeys("testleaf.2023@gmail.com");

		//Enter the Password
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		 
		Thread.sleep(3000);
		
		//Click on login button
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		//Print the title of the web page
		System.out.println(driver.getTitle());
		
	}

}
