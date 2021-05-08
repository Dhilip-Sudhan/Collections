package AssignmentWeek3Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign3ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		
//		Set the system property and Launch the URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		
//		Click the 'sort on date' checkbox
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(2000);
		
//		clear and type in the from station text field
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("TPJ", Keys.TAB);
		Thread.sleep(2000);
		
//		clear and type in the to station text field
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("NDLS", Keys.TAB);
		
//		Add a java sleep for 2 seconds
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		Thread.sleep(2000);
		
//		Store all the train names in a list
		List<WebElement> allTrainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < allTrainNames.size(); i++) {
			String text = allTrainNames.get(i).getText();
			list.add(text);
		}
		
		System.out.println(list.size());
	
//		Add the list into a new Set
		HashSet<String> charSet = new HashSet<String>(list);
		
		
		
//		And print the size of it

	}

}
