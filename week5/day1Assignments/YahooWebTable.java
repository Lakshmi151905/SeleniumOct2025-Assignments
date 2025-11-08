package week5.day1Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooWebTable {

	public static void main(String[] args) throws InterruptedException {
		//Instantiating the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://finance.yahoo.com/");
		// wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Accepting the cookies
		driver.findElement(By.xpath("//button[text()='Accept all']")).click();
		driver.findElement(By.xpath("//div[text()='Markets']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Crypto'])[3]")).click();
		System.out.println("Clicked on Crypto Currency");
		Thread.sleep(5000);
		//Find the Column size
		List<WebElement> colNames = driver.findElements(By.xpath("//table//thead/tr/th"));
		int colsize = colNames.size();
		System.out.println("The number of Rows - "+colsize);
		// Find the Row Size
		List<WebElement> crytoNames = driver.findElements(By.xpath("//table//tbody//tr/td[2]"));
		int size = crytoNames.size();
		System.out.println("The number of Rows - "+size);
		// loop to Iterate through cryptocurrency names and Print it
		for (WebElement crytoName: crytoNames) {
			System.out.println(crytoName.getText());
		}
		driver.quit();
	}

}
