package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;

public class Ivontext {
	WebDriver driver = null;
	
	  @BeforeMethod
	  public void Launch(ITestContext data) {
		  
		  String Unm="swathi";
		  String Pwd="swathi";
		  
		  data.setAttribute("user", Unm);
		  data.setAttribute("password", Pwd);
		  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		  

	  }

	  @Test
	  public void facebook(ITestContext data) {
		  
		  driver .get("https://www.facebook.com/");
		  driver.findElement(By.id("email")).sendKeys((String)data.getAttribute("user"));
		  driver.findElement(By.id("pass")).sendKeys((String)data.getAttribute("password"));
		  driver.findElement(By.id("loginbutton")).click();
		  
	  }
	  
	  @Test
	  public void netTours(ITestContext data) {
		  
		  driver .get("http://newtours.demoaut.com/");
		  driver.findElement(By.name("userName")).sendKeys((String)data.getAttribute("user"));
		  driver.findElement(By.name("password")).sendKeys((String)data.getAttribute("password"));
		  driver.findElement(By.name("login")).click();
		  
	  }

}
