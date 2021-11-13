package browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		//driver.manage().window().maximize();
		//String URL = driver.getCurrentUrl();
		//System.out.println(URL);
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//driver.findElement(By.linkText("This is a link")).click();
		
	    driver.findElement(By.id("fname")).sendKeys("test");
	    driver.findElement(By.xpath(" //button[@id='idOfButton']")).click();
	    driver.findElement(By.xpath("//body/div[1]/div[8]/div[1]/form[1]/input[1]")).click();
	
	    WebElement testDropDown = driver.findElement(By.id("testingDropdown"));  
	    Select dropdown = new Select(testDropDown);  
	    dropdown.selectByValue("Performance");  
	    
	    //Actions act = new Actions(driver);
	    //WebElement s = driver.findElement(By.xpath(" //button[@id='dblClkBtn']"));
	    //act.moveToElement(s).doubleClick().build().perform();
	    //driver.switchTo().alert().accept();
	    
	    Actions act = new Actions(driver);
	    WebElement s = driver.findElement(By.id("dblClkBtn"));
	    act.moveToElement(s).doubleClick().build().perform();
	    driver.switchTo().alert().accept();

		
	}
}
