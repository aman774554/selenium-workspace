package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class status {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.selenium.dev/downloads/");
		
	    driver .get("https://www.facebook.com/");
	    
	    WebElement img = driver.findElement(By.xpath("//div[@class='_5iyy']//img[@class='img']"));

	    System.out.println(img.isDisplayed());
	    System.out.println(img.isEnabled());
	    System.out.println(img.isSelected());
	    
	    //===========================================
	    
	    WebElement Unm = driver.findElement(By.id("email"));
	    Unm.sendKeys("welcome");
	    Thread.sleep(2000);
	    Unm.clear();
	    Unm.sendKeys("A1@gmail.com");
	    
	   
	    
	    
	}

}
