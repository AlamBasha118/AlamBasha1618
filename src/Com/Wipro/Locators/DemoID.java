package Com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Helper;

public class DemoID {
	WebDriver driver;
	
	@Test 
	
	public void TestNameDemo() {
		driver = Helper.startbrouser("Microsoft Edge");
		driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("alambashakoutal@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Alambasha1618");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).click();
	}
}
