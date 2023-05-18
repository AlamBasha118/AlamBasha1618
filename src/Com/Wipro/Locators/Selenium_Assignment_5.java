package Com.Wipro.Locators;

import Utility.Helper;
import org.openqa.selenium.WebDriver;

public class Selenium_Assignment_5 {
	
	
WebDriver driver;
	
	@Test 
	public void TestNameDemo() {
		
		//Launching Chrome Brouser and URL
		driver = Helper.startbrouser("Google Chrome");
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		//Enter All Mandatory fields like....First Name, Last Name, Email and Password
		driver.findElement(By.id("input-firstname")).sendKeys("Alam");
		driver.findElement(By.id("input-lastname")).sendKeys("Basha");
		driver.findElement(By.id("input-email")).sendKeys("alambashakoutal@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Alambasha1618");
		driver.findElement(By.id("input-newsletter-yes")).click();
		driver.findElement(By.name("agree")).click();
		
		//Clicking on Continue button
		driver.findElement(By.xpth("//button[@type='submit']")).click();
		
		//Verify Home Page Title
		String title=driver.getTitle();
		if(title.equals("Your Store")) {
			System.out.println("Title is verified successfully");
		}else {
			System.out.println("Title is not verified successfully");
		}
		
		//Login in to "demo.opencart.com" with valid credentials
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("alambashakoutal@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Alambasha1618");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Validating 
		title= driver.getTitle();
		
		if(title.equals("Your Store")) {
			System.out.println("Title is verified successfully");
		}else {
			System.out.println("Title is not verified successfully");
		}
	}

}
