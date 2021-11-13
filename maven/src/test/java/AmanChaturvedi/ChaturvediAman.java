package AmanChaturvedi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChaturvediAman {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/b[1]/font[1]/input[2]")).click();
		Thread.sleep(1000);
		
	    WebElement testDropDown = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/b[1]/select[1]"));  
	    Select dropdown = new Select(testDropDown);  
	    dropdown.selectByValue("2");
	    Thread.sleep(1000);
	    
	    WebElement t2 = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/select[1]"));  
	    Select dropdown2 = new Select(t2);  
	    dropdown2.selectByValue("Paris");
	    Thread.sleep(1000);
	    
	    WebElement t3 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/select[1]"));  
	    Select dropdown3 = new Select(t3);  
	    dropdown3.selectByIndex(7);;
	    Thread.sleep(1000);
	    
		driver.findElement(By.cssSelector("tr:nth-child(9) td:nth-child(2) font:nth-child(1) font:nth-child(2) > input:nth-child(2)")).click();
		Thread.sleep(1000);
	    
	    WebElement t4 = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/select[1]"));  
	    Select dropdown4 = new Select(t4);  
	    dropdown4.selectByIndex(3);;
	    Thread.sleep(1000);
	    
	    //driver.findElement(By.xpath("//tbody/tr[14]/td[1]/input[1]")).click();    
	    	    
	}
}
