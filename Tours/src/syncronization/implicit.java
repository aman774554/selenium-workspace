package syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
		  driver .get("http://newtours.demoaut.com/");
		  
		  //implicit wait
		  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.NANOSECONDS);
		  
		  WebElement Unm = driver.findElement(By.name("userName"));
		  Unm.sendKeys("mercury");
		  
		  WebElement Pwd = driver.findElement(By.name("password123"));
		  Pwd.sendKeys("mercury");
		  
		  WebElement Log = driver.findElement(By.name("login"));
		  Log.click();
		  
	}

}
