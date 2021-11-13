package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter {
	WebDriver driver = null;
	
	@Parameters({"browse" , "URL"})
  @Test
  public void Launch(String browse , String URL) {
	  switch(browse)
	  {
	  case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    break;
	  case "FF":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    break;
	  case "ie":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    break;
	  }
	  driver.get(URL);
	  
  }
}
