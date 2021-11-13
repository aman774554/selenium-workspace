package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
	    driver .get("https://www.amazon.in/");
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
	    driver.findElement(By.xpath("//input[@value='Go']")).click();
	    Thread.sleep(1500);
	    
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[4]/ul[6]/li[3]/span[1]/a[1]/span[1]")).click();

	}

}
