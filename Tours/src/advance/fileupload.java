package advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver .get("https://www.naukri.com/");
	  
	    Robot r = new Robot();
	    driver.findElement(By.id("wdgt-file-upload")).click();
	    
	    r.setAutoDelay(1000);
	    
	    StringSelection ss = new StringSelection("C:\\Users\\aman7\\OneDrive\\Desktop\\reading.txt\\");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    

	}

}
