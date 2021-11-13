package syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver .get("https://www.facebook.com/");
	    
	    driver.findElement(By.id("email")).sendKeys("abc");
	    Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("test");
		Thread.sleep(1000);
		  driver.findElement(By.id("loginbutton")).click();
	}

}
