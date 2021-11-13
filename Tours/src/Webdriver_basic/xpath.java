package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.selenium.dev/downloads/");
		
	    driver .get("https://www.facebook.com/");
	    //=========================================
	   
	    //absolute -- using atributes --- //input[@id='email']
	    //Relative --- Based on position --

	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("welcome");
	}

}
