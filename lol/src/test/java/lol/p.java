package lol;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class p {
	WebDriver driver=null;
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chrodriver.exe");
	    driver = new ChromeDriver();
	}
	  @Test
	  public void check() {

		    driver .get("https://www.telerik.com/support/demos");
		    Assert.assertEquals(driver.getTitle(), "Telerik Product Demos, Examples and Tutorials for all Telerik products");
	  }
	  @AfterMethod
	  public void close() {
		  driver.close();
	  }
}
