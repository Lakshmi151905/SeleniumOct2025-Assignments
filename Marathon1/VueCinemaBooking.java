package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VueCinemaBooking {

	public static void main(String[] args) throws InterruptedException {

		//Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize(); 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//load the URL
		driver.get("https://www.myvue.com/");
		//Thread.sleep(2000);

		//accept cookies
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		//Choose your Venue in Quick Book
		driver.findElement(By.xpath("//span[text() = 'Choose A Venue']")).click();
		Thread.sleep(2000);
// Select a Theatre location
		driver.findElement(By.xpath("(//input[@data-test='venue-selector-dropdown-search-input'])[2]")).sendKeys("Dublin");
		driver.findElement(By.xpath("//span[@class='highlighted-part']")).click();
		Thread.sleep(2000);
		//Selecting a Film
		driver.findElement(By.xpath("//span[text() = 'Choose A Film or Event']")).click();
		driver.findElement(By.xpath("//input[@data-test='quick-book-dropdown-search-input']")).sendKeys("Pets on a train");
		driver.findElement(By.xpath("//span[@class='highlighted-part']")).click();
		Thread.sleep(2000);
		//Choosing a Movie
		driver.findElement(By.xpath("//span[text() = 'Choose A Date']")).click();
	Thread.sleep(2000);
	//choosing a Movie Time
		driver.findElement(By.xpath("//strong[contains(text() ,'Tomorrow' )]/parent::span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = 'Choose A Time']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='session-time']")).click();
		Thread.sleep(2000);
		//click on Quick Book button
		driver.findElement(By.xpath("//div[@class ='quick-book__button-box']")).click();
		Thread.sleep(2000);
		//Select a seat
		WebElement element = driver.findElement(By.xpath("//div[@data-test='seats-row-11']//img"));
		driver.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		//Enter Email Id
		driver.findElement(By.xpath("//input[@placeholder='Your email address']")).sendKeys("pretha.ss@gmail.com");
		//click on Review and Pay Button
		driver.findElement(By.xpath("//button[@data-test='review-and-pay-button']")).click();
		Thread.sleep(2000);
		//Click on Countinue as guest button
		driver.findElement(By.xpath("(//button[text()='CONTINUE AS A GUEST'])[2]")).click();
		Thread.sleep(2000);
		//Get the Seat Number Selected and Print it
		String seatSelected =driver.findElement(By.xpath("//ul[@data-test='review-and-pay-seats-list']/li")).getText();
		System.out.println("The Seat Selected is: "+seatSelected);
		//Get the Total price and Print it
		String totalPrice = driver.findElement(By.xpath("//dl[@class='total-price-box']/dd[@class='total-price-box__value']")).getText();
		System.out.println("The Grand total Price to be paid: "+totalPrice);
		//Print the Title of the current Page
		System.out.println("The Current Page title is : "+driver.getTitle());
		//Close the browser
		driver.quit();
	}

}
