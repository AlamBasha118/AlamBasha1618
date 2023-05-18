package Com.Wipro.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Helper;

public class Selenium_Assignment_Six {
	public static void main(String[] args) {
		//Launching Chrome Brouser and URL
		System.setProperty("webdriver.chrome.driver","C:\\SDET Training\\Selenium_Locators\\Driver\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.google.com/");
	} }
		
		


