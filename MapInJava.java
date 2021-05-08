package AssignmentWeek3Day2;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MapInJava {

	public static void main(String[] args) throws InterruptedException {
		
//		1) Set the property
		WebDriverManager.chromedriver().setup();
		
//		2) Initiate ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
//		3) Launch the URL - https://erail.in/
		driver.get("https://erail.in/");
		
//		4) Maximize the browser
		driver.manage().window().maximize();
		
//		5) Add implicityWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		6) Clear and type in the from station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("TPJ", Keys.TAB);
		Thread.sleep(2000);
			
//		7) Clear and type in the to station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("NDLS", Keys.TAB);
		Thread.sleep(2000);
		
//		8) Uncheck the 'Sort on Date' checkbox		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(2000);
		
//		9) Declare a Map
		Map<String, String> map = new TreeMap<String, String>();
			
//		10) Store the table in a web element
		List<WebElement> allTrainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
			
//		11) Get all the rows and store it in a List
			
//		12) Iterate the rows and store all the columns in a List
			
//			13) Check and get the values that start with 'S'

//			14) If the condition satisfies add it into the map as key & 	value

//			15) Print those values by iterating the map

	}

}
