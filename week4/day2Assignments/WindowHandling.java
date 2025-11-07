package week4.day2Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create an instance of ChromeOptions
		ChromeOptions option = new ChromeOptions();

		// Add argument to open Chrome in Guest Mode
		option.addArguments("--guest");

		//Instantiating the Browser(chrome) Driver
		ChromeDriver driver = new ChromeDriver(option);

		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

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

		//Click on Contacts Tab

		driver.findElement(By.linkText("Contacts")).click();

		//Click on Merge Contacts Link
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("//table[@widgetid='ComboBox_partyIdFrom']/following-sibling::a")).click();
		//get all the windows
		Set<String> window = driver.getWindowHandles();
		
		//convert set into List
		List<String> listWindow=new ArrayList<String>(window);
		  //navigate to child window 
				driver.switchTo().window(listWindow.get(1));
				  //address of child window 
				String chWindow = driver.getWindowHandle();
				  System.out.println(chWindow); //title of child
				 // System.out.println(driver.getTitle());
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
				  //navigate to Parent window 
					driver.switchTo().window(listWindow.get(0));
					  //address of parent window 
					//String parentWindow = driver.getWindowHandle();
				driver.findElement(By.xpath("//table[@widgetid='ComboBox_partyIdTo']/following-sibling::a")).click();
				//get all the windows
				Set<String> cwindow = driver.getWindowHandles();
				
				//convert set into List
				List<String> listWindows=new ArrayList<String>(cwindow);
				  //navigate to child window 
						driver.switchTo().window(listWindows.get(1));
						  //address of child window 
						String chWindows = driver.getWindowHandle();
						  System.out.println(chWindows); //title of child
						 // System.out.println(driver.getTitle());
						  Thread.sleep(3000);
						  driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[5]")).click();
						  //navigate to Parent window 
							driver.switchTo().window(listWindows.get(0));
							  //address of parent window 
							//String parentWindows = driver.getWindowHandle();
						driver.findElement(By.linkText("Merge")).click();
						Alert alert = driver.switchTo().alert();
						alert.accept();
						 Thread.sleep(3000);
						String title=driver.getTitle();
						System.out.println(title);
						if(title.equalsIgnoreCase("View Contact | Opentaps CRM")) {
							System.out.println("The Page Title: "+title+ "is verified");
						
						}
						driver.quit();
						
	}

}
