package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectBrowser {

	static WebDriver  driver;
	public  static WebDriver Browser(String pbrowser , String URL)
	{
		if(pbrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    
		}
		
		else if (pbrowser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		}
		
		else if (pbrowser.equalsIgnoreCase("IE"))
	
		{
			System.setProperty("webdriver.IE.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
		    WebDriver driver = new InternetExplorerDriver();
		    driver.manage().window().maximize();
		}
		
		driver.get(URL);
		return driver;
	}
}
