package Utility;

import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static WebDriver startbrouser(String browser) {
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Chrome")|| browser.equalsIgnoreCase("GC")|| browser.equalsIgnoreCase("Google Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")|| browser.equalsIgnoreCase("EG")|| browser.equalsIgnoreCase("Microsoft Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
			driver=new EdgeDriver();
		}else {
			System.out.println("Sorry we do not support this browser");
		}
		return driver;
	}
	
	public static void closebrowser(WebDriver driver) {
		driver.quit();
	}

}
