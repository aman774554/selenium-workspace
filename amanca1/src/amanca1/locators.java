package amanca1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class locators {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chrodriver.exe");
    WebDriver driver = new ChromeDriver();
    
	  driver.get("https://www.telerik.com/support/demos");
	  
	  driver.manage().window().maximize();
	
	  driver.findElement(By.id("js-tlrk-nav-search-link")).click();
	  driver. navigate(). back();
	  driver.findElement(By.className("TK-Aside-Menu-Link")).click();
	  driver. navigate(). back();
	  driver.findElement(By.tagName("a")).click();
	  driver. navigate(). back();
	  driver.findElement(By.linkText("Check out")).click();
	  driver. navigate(). back();
	  driver.findElement(By.partialLinkText("Check")).click();
	  driver. navigate(). back();
	  driver.findElement(By.cssSelector("body.telerik:nth-child(2) nav.TK-Nav.TK-Nav--Shadow.TK-Nav--Loaded:nth-child(11)"
	  		+ " section.TK-Bar div.TK-container.TK-Bar-container div.TK-Drawer ul.TK-Context-Menu.TK-Menu"
	  		+ " li.TK-Menu-Item:nth-child(4) > a.TK-Menu-Item-Link")).click();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//body/nav[@id='js-tlrk-nav']/section[1]/div[1]/figure[1]/a[1]/*[1]")).click();
	  driver. navigate(). back();
	}
	}
