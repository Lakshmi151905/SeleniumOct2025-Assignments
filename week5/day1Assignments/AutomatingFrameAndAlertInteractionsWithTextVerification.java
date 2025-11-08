package week5.day1Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndAlertInteractionsWithTextVerification {

	public static void main(String[] args) throws InterruptedException {
//Instantiating the Chrome Browser
ChromeDriver driver = new ChromeDriver();
//Maximize the browser
driver.manage().window().maximize();
//Load the URL
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
// wait statement
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// Accepting the cookies
driver.findElement(By.id("accept-choices")).click();
// Switch to Frame
driver.switchTo().frame("iframeResult");
// click on the Button
driver.findElement(By.xpath("//button[text()='Try it']")).click();
//Switch to alert and  Accept the alert
driver.switchTo().alert().accept();
// switch to default DOM content
driver.switchTo().defaultContent();
//switch to frame
driver.switchTo().frame("iframeResult");
//Locating the text in the frame
String Text=driver.findElement(By.xpath("//button[text()='Try it']/following-sibling::p")).getText();
if(Text.contentEquals("You pressed OK!")) {
	System.out.println("Alert is handled successfully ");
}
else {
	System.out.println("Alert is not handled successfully");
}
driver.quit();

	}

}
