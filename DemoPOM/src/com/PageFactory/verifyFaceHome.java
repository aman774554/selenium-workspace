package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyFaceHome {
	WebDriver driver = null;
	 FacebookHomeElement L1 ;
	 
	 
  @BeforeMethod 
  public void Launch()
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver .get("https://www.facebook.com/");
	    
	  // L1 = new FacebookHomeElement(driver);
  
	    L1 = PageFactory.initElements(driver, FacebookHomeElement.class);
  }
	
  @Test (priority = 1)
  public void VLogin() {
	//FacebookHomeElement L1 = new FacebookHomeElement(driver);
		L1.Login("B1.@gmail.com","test");
  }
  
  @Test(priority = 2)
  public void VForgotPwd()
  {
	  L1.ForgotPwd();
  }
	
	@AfterMethod()
	public void Close()
	{
	driver.close();
	}
}
