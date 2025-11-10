package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSearchResults {

	public static void main(String[] args) throws InterruptedException {

		//Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Window
		driver.manage().window().maximize();

		//Load the Amazon URL
		driver.get("https://www.amazon.in/");

		//Adding implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		try {
			//click on continue shipping button
			driver.findElement(By.xpath("//button[text() ='Continue shopping']")).click();

			//Search for Bags for boys in the search box
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys",Keys.ENTER);
			
		}
		catch(Exception e) {
			//Search for Bags for boys in the search box
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys",Keys.ENTER);
		}
			//print the results
			String Result = driver.findElement(By.xpath("//div[@class='sg-col-inner']//h2")).getText();
			System.out.println("The results for searching bags for boys is : "+Result);
			Thread.sleep(3000);
			//Selecting the first 2 brands in the left menu
			//Selecting the first brand
			driver.findElement(By.xpath("//div[@id='brandsRefinements']//li//i")).click();
			Thread.sleep(3000);

			//selecting the second brand
			driver.findElement(By.xpath("(//div[@id='brandsRefinements']//li//i)[2]")).click();
			Thread.sleep(3000);
			//Choose New Arrivals for sort
			Select sortBy= new Select(driver.findElement(By.id("s-result-sort-select")));

			sortBy.selectByVisibleText("Newest Arrivals");
			Thread.sleep(3000);
			//Finding the Name and Discounted Price of the first results
			String bagName	=driver.findElement(By.xpath("//div[@role='listitem']//h2/span")).getText();
			Thread.sleep(3000);
			String bagPrice	=driver.findElement(By.xpath("//span[@class ='a-price-whole']")).getText();
			//System.out.println(bagPrice);
			System.out.println("The First Resulting Bag Info is:  "+bagName+ " and its discounted price:- " +bagPrice);

			//get the page title
			String title =driver.getTitle();
			System.out.println("The current title is : "+title);
			//quit the browser
			driver.quit();

		

	}

}
