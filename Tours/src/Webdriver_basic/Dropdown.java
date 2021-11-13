package Webdriver_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
	    driver .get("https://www.facebook.com/");
	    
	    WebElement day = driver.findElement(By.id("day"));
	    
	    Select d1 = new Select(day);
	    //d1.selectByIndex(3);
	    d1.selectByValue("2");
	    //d1.selectByVisibleText("Day");
	    System.out.println(day.getAttribute("value"));
	    
	    //========================================================
	    
	    List<WebElement> dd = d1.getOptions();
	    System.out.println(dd.size());
	    
	    for (int i=0; i<dd.size(); i++)
	    {
	    	String txt = dd.get(i).getText();
	    	System.out.println(txt);
	    	dd.get(i).click();
	    	
	    }
	    
	    
	    
	    

	}

}
