package Com.Wipro.Locators;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.Helper;

public class Selenium_Assignment_6 {
	
WebDriver driver;
	int Total=0;
	@Test 
	
	public void TestNameDemo() {
		driver = Helper.startbrouser("Microsoft Edge");
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		int linkcount =list.size();
		System.out.println("Number of links: " +linkcount);
		for (int i=1; i<linkcount; i++) {
			System.out.println(list.get(i).getText());
		}
		
	}
}
		


