package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver .get("https://jqueryui.com/droppable/");
	    
	    Actions act = new Actions(driver);
	    driver.findElement(By.tagName("iframe"));
	    driver.switchTo().frame(0);
	    Thread.sleep(1000);
	    
	    WebElement src = driver.findElement(By.id("draggable"));
	    
	    WebElement tgt = driver.findElement(By.id("droppable"));
	    act.dragAndDrop(src, tgt).perform();
	    
	    //===============================================
	    if(tgt.getText().matches("Dropped!"));
	    {
	    	System.out.println("successful");
	    }
	    
	    

	}

}
