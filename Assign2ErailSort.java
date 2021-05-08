package AssignmentWeek3Day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2ErailSort {

	public static void main(String[] args) throws InterruptedException {
		
//		Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		Launch the URL - https://erail.in/
		driver.get("https://erail.in/");
		
//		Uncheck the check box - sort on date
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(2000);
		
//		clear and type in the source station
		driver.findElement(By.id("txtStationFrom")).clear();
		Thread.sleep(2000);
//		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS")
		driver.findElement(By.id("txtStationFrom")).sendKeys("TPJ", Keys.TAB);
		
//		clear and type in the destination station
		driver.findElement(By.id("txtStationTo")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationTo")).sendKeys("NDLS", Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		Thread.sleep(2000);
		
//		Find all the train names using xpath and store it in a list
		List<WebElement> allTrainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		List<String> lstnames = new ArrayList<String>();
		for (int i = 0; i < allTrainNames.size(); i++) {
			String list = allTrainNames.get(i).getText();
			lstnames.add(list);
			System.out.println(list);
		}
//		Use Java Collections sort to sort it and then print it
		Collections.sort(lstnames);
		System.out.println("The Sorted Trains are : " + lstnames);
		
		
	}

}
