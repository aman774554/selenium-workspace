package tit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class check {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriverrr.exe");
	      WebDriver driver = new ChromeDriver();
		  driver .get("https://www.amazon.in/");
		  System.out.println("Page Title: "+driver.getTitle());
		  
		  if(driver.getTitle().contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		  {
			  System.out.println("Pass");
			 
		  }
		  else
		  {
			  System.out.println("fail");
			  
		  
		  }
		  
		  
		  
	}
}