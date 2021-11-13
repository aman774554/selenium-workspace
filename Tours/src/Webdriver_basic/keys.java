package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com/");
	    
	    Actions act = new Actions(driver);
	    driver.findElement(By.name("userName")).sendKeys("Aman");
	    
	    act.click(driver.findElement(By.name("userName")))
	    .keyDown(org.openqa.selenium.Keys.CONTROL)
	    .sendKeys("a")
	    .sendKeys("c")
	    .keyUp(org.openqa.selenium.Keys.CONTROL)
	    .click(driver.findElement(By.name("password")))
	    .keyDown(org.openqa.selenium.Keys.CONTROL)
	    .sendKeys("v")
	    .keyUp(org.openqa.selenium.Keys.CONTROL)
	    .build()
	    .perform();
	    
	    
	}

}
