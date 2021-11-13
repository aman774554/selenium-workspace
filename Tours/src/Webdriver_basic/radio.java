package Webdriver_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver .get("https://www.facebook.com/");
	    
	    List <WebElement> gender = driver.findElements(By.name("sex"));
	    
	    int cnt = gender.size();
	    System.out.println(cnt);
	    
	    //=================================
	    
	    for(int i=0; i<cnt; i++)
	    {
	    	String txt = gender.get(i).getText();
	    	System.out.println(txt);
	    	
	    	gender.get(i).click();
	    	Thread.sleep(1000);
	    	
	    }
	    
	}

}
