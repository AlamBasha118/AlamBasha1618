package Com.Wipro.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Helper;

public class Selenium_Assignment_9 {
	public static void main(String[] args) {
		
		//launching the brouser
		WebDriver driver=Helper.startbrouser("Google Chrome");
		driver.get("https://www.easycalculation.com/index.php");
		driver.manage().window().maximize();
		
		//Click on Age Calculator, number of links and images and print top 5 Text of anchors
		driver.findElement(By.xpath("//a[@href='//www.easycalculation.com/date-day/age-calculator.php']")).click();
		
		 List<WebElement> Links=driver.findElements(By.tagName("a"));
		 int Totallinks=Links.size();
		int TotalImages=driver.findElements(By.tagName("img")).size();
		System.out.println("Total number of Links in the page is: "+Totallinks);
		System.out.println("Total number of Images in the page is: "+TotalImages);
		
		//printing top 5 Text of Anchors
		for (int i=1; i<6; i++) {
			System.out.println(Links.get(i).getText());
		}
		
		//Selecting date of independence
		driver.findElement(By.xpath("//input[@id='i21']")).sendKeys("15");
		driver.findElement(By.xpath("//input[@id='i22']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@id='i23']")).sendKeys("1947");
		
		//click on go button
		driver.findElement(By.xpath("////input[@name='but']")).click();
		
		//printing Values of 
		String YourAgeIs=driver.findElement(By.xpath("//input[@id='r1']")).getAttribute("Value");
		String YourAgeinDays=driver.findElement(By.xpath("//input[@id='r4']")).getAttribute("Value");
		String YourAgeisinHours=driver.findElement(By.xpath("//input[@id='r3']")).getAttribute("Value");
		String YourAgeisinMinutes=driver.findElement(By.xpath("//input[@id='r2']")).getAttribute("Value");
		System.out.println("Your Age Is: "+YourAgeIs);
		System.out.println("Your Age Is in Days: "+YourAgeinDays);
		System.out.println("Your Age Is in Hours: "+YourAgeisinHours);
		System.out.println("Your Age Is in Minutes: "+YourAgeisinMinutes);
		
		//click on Reset
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
		
		
		
	}
}
