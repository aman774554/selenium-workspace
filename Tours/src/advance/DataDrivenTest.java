package advance;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman7\\Downloads\\selenium_jar\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver .get("https://www.facebook.com/");
		
		// Reading the excel file
		Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\aman7\\OneDrive\\Desktop\\readingexcel.xls"));
		Sheet sh= wb.getSheet("abc");
		
		for(int i=1; i<sh.getRows(); i++)
		{
			WebElement Unm = driver.findElement(By.id("email"));
			WebElement Pwd = driver.findElement(By.id("pass"));
			
			Unm.sendKeys(sh.getCell(0,i).getContents());
			Pwd.sendKeys(sh.getCell(1,i).getContents());
		
			Thread.sleep(200);
			Pwd.clear();
			Unm.clear();
		}
		
		

	}

}
