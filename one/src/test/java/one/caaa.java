package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class caaa {
	@BeforeClass
	public void Launch()
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test(priority=1)
	public void title()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.telerik.com/support/demos");
		 //System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Telerik Product Demos, Examples and Tutorials for all Telerik products");
		driver.close();
	}
	@Test(priority=2)
	public void click()
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.telerik.com/support/demos");
		  driver.findElement(By.xpath("//body/nav[@id='js-tlrk-nav']/section[1]/div[1]/figure[1]/a[1]/*[1]")).click();
		  driver. navigate(). back();
		  driver.close();
	}
	  @AfterClass
	  public void close() {
		  System.out.println("Test Completed...");
	  }
}
