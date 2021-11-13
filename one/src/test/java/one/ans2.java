package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ans2 {
	@BeforeClass
	public void Launch()
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test(priority=1)
	public void title()
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/");
		 System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "opensourcecms – Just another WordPress site");
		driver.close();
	}
	@Test(priority=2)
	public void click()
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/");
		  driver.findElement(By.xpath("//header/h3[1]/a[1]")).click();
		  driver. navigate(). back();
		  driver.close();
	}
	  @AfterClass
	  public void close() {
		  System.out.println("Test Completed...");
	  }
}
