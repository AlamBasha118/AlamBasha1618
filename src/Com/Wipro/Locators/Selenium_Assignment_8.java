package Com.Wipro.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Helper;

public class Selenium_Assignment_8 {
	
	public static void main(String[] args) {
		WebDriver driver=Helper.startbrouser("Google Chrome");
		driver.get("https://naukri.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		System.out.println("Total Links are in this page is: "+allLinks.size());
		
		for (WebElement ele:allLinks) {
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("href"));
		}
		
		List<WebElement> allImages =driver.findElements(By.tagName("img"));
		System.out.println("Total Images are in this page is: "+allImages.size());
		
		for (WebElement ele1:allImages) {
			System.out.println(ele1.getAttribute("src"));
		}
	}

}
