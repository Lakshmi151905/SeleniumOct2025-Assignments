package week4.day2Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyntraAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags");
		driver.findElement(By.className("desktop-submit")).click();
		Thread.sleep(5000);
	WebElement gender=	driver.findElement(By.xpath("//input[@value='men,men women']/parent::label"));
		gender.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='categories-list']/li/label/input[@value = 'Laptop Bag']//following-sibling::div")).click();
		Thread.sleep(5000);
		String count= driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("The number of Bags listed are : "+count);
		List<WebElement> brands=driver.findElements(By.xpath("//div[@class='vertical-filters-filters brand-container']/ul[@class='brand-list']/li/label"));
		List<String> brandNames = new ArrayList<String>();
		int size= brands.size();
		for (WebElement brand : brands) {
			String name = brand.getText();
			String brandname= name.replaceAll("[^A-z]","");
			System.out.println(brandname);
			brandNames.add(brandname);
		}
		System.out.println("The list of Brand names mentioned are: "+brandNames);
		
		List<WebElement> productbrands=driver.findElements(By.xpath("//h3[@class='product-product']"));
		List<String> productbrandNames = new ArrayList<String>();
		//int size= brands.size();
		for (WebElement productbrand : productbrands) {
			String productbrandname = productbrand.getText();
			String productbrandnames= productbrandname.replaceAll("[^A-z]","");
			System.out.println(productbrandnames);
			productbrandNames.add(productbrandnames);
		}
		System.out.println("The list of Product Brand names Displayed are: "+productbrandNames);
		
		List<WebElement> productname=driver.findElements(By.xpath("//h4[@class='product-product']"));
		List<String> productNames = new ArrayList<String>();
		//int size= brands.size();
		for (WebElement product : productname) {
			String productnames = product.getText();
			String productNamess= productnames.replaceAll("[^A-z]","");
			System.out.println(productNamess);
			productNames.add(productNamess);
		}
		System.out.println("The list of Product Brand names Displayed are: "+productNames);
	}

}
