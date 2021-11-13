package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.selenium.dev/downloads/");
		
	    driver .get("https://www.facebook.com/");
	    
	    String title = driver.getTitle();
	    System.out.println("Title is: "+title);
	    
	    //===========================================
	    
	    System.out.println(driver.getCurrentUrl());
	    
	    WebElement Unm = driver.findElement(By.id("email"));
	    System.out.println(Unm.getAttribute("id"));
	    System.out.println(Unm.getTagName());
	    driver.close();
	}

}
