package syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
		  driver .get("http://newtours.demoaut.com/");
		  
		  //Explicit wait
		  
		  WebDriverWait w = new WebDriverWait(driver,20);
		  
		  WebElement Unm = driver.findElement(By.name("userName"));
		  Unm.sendKeys("mercury");
		  
		  
		  w.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		  WebElement Pwd = driver.findElement(By.name("password"));
		  Pwd.sendKeys("mercury");
		  
		  w.until(ExpectedConditions.numberOfElementsToBe(By.name("login"), 5));
		  WebElement Log = driver.findElement(By.name("login"));
		  Log.click();

	}

}
