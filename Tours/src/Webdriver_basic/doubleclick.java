package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver .get("https://www.amazon.in/");
	    
	    Actions act = new Actions(driver);
	    
	    WebElement signin = driver.findElement(By.xpath("//span[contains(text(),'& Orders')]"));
	    
	    	//act.moveToElement(signin).doubleClick().build().perform();
	    //act.doubleClick(signin).build().perform();
	    
	    act.moveToElement(signin).contextClick().build().perform();
	    
	    

	}

}
