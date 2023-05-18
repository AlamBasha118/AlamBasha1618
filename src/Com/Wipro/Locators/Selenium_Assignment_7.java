package Com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Helper;

public class Selenium_Assignment_7 {
	WebDriver driver;
	
	@Test 
	
	public void TestNameDemo() {
		
		// use Test Framework and open URL
		driver = Helper.startbrouser("Microsoft Edge");
		driver.navigate().to("https://www.easemytrip.com/flights.html");
		driver.manage().window().maximize();
		
		//click on "Holiday" link and then click on "Hotels"
		driver.findElement(By.xpath("//a[@href='https://www.easemytrip.com/holidays/']")).click();
		
		//verify "Turn Your Dream Holiday Into A Reality" in Holidays
		String text1=driver.findElement(By.xpath("//h1[normalize-space()='Turn Your Dream Holiday Into A Reality']")).getText();
		if(text1.equalsIgnoreCase("Turn Your Dream Holiday Into A Reality")) {
			System.out.println("Link Text is verified successfully");
		}else {
			System.out.println("Link Text is Not verified successfully");
		}
		
		
		//click on Hotel
		driver.findElement(By.xpath("//a[@class='active_n']']")).click(); ////h1[@class='hp_title']
		
		//Verify "Same hotel, Cheapest price. Guaranteed!" Text in Hotels link
		String text2=driver.findElement(By.xpath("//h1[@class='hp_title']")).getText();
		if(text2.equalsIgnoreCase("Same hotel, Cheapest price. Guaranteed!")) {
			System.out.println("Link Text is verified successfully");
		}else {
			System.out.println("Link Text is Not verified successfully");
		}
		
		
		//Count number of links and verify Home Page Title name
		driver.findElement(By.xpath("//i[@class='newHeaderLogo']")).click();
		int Totallinkcount= driver.findElements(By.tagName("a")).size();
		System.out.println("Total Number of links in the web Page is: "+Totallinkcount); //
		
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Book Flights, Hotels, Bus Tickets & Holidays - EaseMyTrip.com")) {
			System.out.println("Home page Title is verified");
		}else {
			System.out.println("Home page Title is not verified");
		}
			
	}
}
