package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver .get("https://ksrtc.in/oprs-web/");
	    
	    driver.findElement(By.xpath("//buttom[@type='submit']")).click();
	    Thread.sleep(2000);
	    
	    String txt = driver.switchTo().alert().getText();
	    System.out.println(txt);
	    
	    if(txt.contentEquals("please select start place."))
	    {
	    	driver.switchTo().alert().accept();
	    	System.out.println("correct alert appeared...");
	   
	    }
	    else
	    
	        System.out.println("Invalid Alert..");
	    driver.close();
	    

	}

}
