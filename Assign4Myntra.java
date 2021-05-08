package AssignmentWeek3Day2;





import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Assign4Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		//Drivers
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable- notification");
		ChromeDriver driver = new ChromeDriver(options);
		//ChromeDriver driver = new ChromeDriver();
		
	// Open https://www.myntra.com/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		
	// Mouse over on WOMEN = new Actions(
		Actions builder = new Actions(driver);
		Action women = builder.moveToElement(driver.findElementByXPath("(//a[text()='Women'])[1]")).build();
		women.perform();
		
	// Click Jackets & Coats
		driver.findElement(By.xpath("//a[text()='Jackets & Coats']")).click();
		Thread.sleep(2000);
		
	//  Find the total count of item
		String Total = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		Total = Total.replaceAll("\\D", "");
		int TotalCount = Integer.parseInt(Total);
		System.out.println("Total count of items :" +TotalCount);
		
	// Validate the sum of categories count matches
		String jacketsCount = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		String coatsCount = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		
		jacketsCount = jacketsCount.replaceAll("\\D", "");
		coatsCount = coatsCount.replaceAll("\\D", "");
		
		int jacCount = Integer.parseInt(jacketsCount);
		int coatCount = Integer.parseInt(coatsCount);
		
		int jacketsCoatsFinal = jacCount + coatCount;
		System.out.println("jacCount + coatCount :-" + jacketsCoatsFinal);
		
		if (jacketsCoatsFinal == TotalCount) {
			System.out.println("The Values of Jackets and Coats matches with total");
		
		} else {
			System.out.println("Count not matched");
		}
		
	// Check Coats
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[2]")).click();
		Thread.sleep(2000);
		
	// Click + More option under BRAND
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		Thread.sleep(2000);
		
	// Type MANGO and click checkbox
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Mango");
		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']//div")).click();
		
	// Close the pop-up x
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
	// Confirm all the Coats are of brand MANGO
		//List<WebElement> brandList = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		
		java.util.List<WebElement> brandList = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		for (WebElement eachBrand : brandList) {
			String brand = eachBrand.getText();
			System.out.println("Brand name is : " +brand );
			
		}
		
	// Sort by Better Discount
		WebElement sortBy = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		builder.moveToElement(sortBy).build().perform();
		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
		
	// Find the price of first displayed item
		String firstItemPrize = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println(firstItemPrize);
			
	// Mouse over on size of the first item
		WebElement size = driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[1]"));
		builder.moveToElement(size).build().perform();
		
	// Click on WishList
		driver.findElement(By.xpath("(//span[text()='wishlist'])[1]")).click();

	// close browser
		driver.close();
		

	}

}
