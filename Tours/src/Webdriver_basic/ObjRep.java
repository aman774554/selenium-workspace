package Webdriver_basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjRep {
	
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver .get("https://www.facebook.com/");
	    
	    //Reading from properties file...
	    
	    Properties p1 = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\aman7\\OneDrive\\Desktop\\data.properties");
		
		p1.load(fis);
		String U = p1.getProperty("Unm");
		String P = p1.getProperty("Pwd");
	    
	    driver.findElement(By.id("email")).sendKeys(U);
	    driver.findElement(By.id("pass")).sendKeys(P);
	    driver.findElement(By.id("loginbutton")).click();
	}

}
