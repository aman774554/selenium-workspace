package lol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class q {
	WebDriver driver=null;
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chrodriver.exe");
	    driver = new ChromeDriver();
	}
	  @Test
	  public void check() {

		    driver .get("https://s1.demo.opensourcecms.com/wordpress/");
		    Assert.assertEquals(driver.getTitle(), "opensourcecms – Just another WordPress site");
	  }
	  @AfterMethod
	  public void close() {
		  driver.close();
	  }
}
