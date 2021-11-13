package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Real1 {
	WebDriver driver=null;
	
//	@BeforeClass
	@BeforeMethod
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chrodriver.exe");
	    driver = new ChromeDriver();
	}
  @Test(priority=1)
  public void facebook() {

	    driver .get("https://www.facebook.com/");
	    Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
  }
  
  @Test(priority=2)
  public void Google() {

	    driver .get("https://www.google.com/");
	    Assert.assertEquals(driver.getTitle(), "Google");
  }
//	@AfterClass
//public void close()
//		{
//			driver.close();
//		}
  
  @AfterMethod
  public void close() {
	  driver.close();
  }
}
