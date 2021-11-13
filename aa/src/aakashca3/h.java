package aakashca3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class h {

	  public String oe(){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriverrr.exe");
	      WebDriver driver = new ChromeDriver();
		  driver .get("https://www.facebook.com/");
		  
		  driver.manage().window().maximize();
		  
		  System.out.println("Page Title: "+driver.getTitle());
		  
	  if(driver.getTitle().contains("Facebook – log in or sign up"))
	  {
		  System.out.println("Pass");
		  return"pass";
	  }
	  else
	  {
		  System.out.println("fail");
		  return"fail";
	  
	  }
}
}
