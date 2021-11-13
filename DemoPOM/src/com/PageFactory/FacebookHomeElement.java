package com.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookHomeElement {
	WebDriver driver;
	
	public FacebookHomeElement(WebDriver driver1)
	{
		driver = driver1;
	}
  

	// By Unm = By.id("email");
//	By Pwd = By.id("pass");
//	By log = By.xpath("//label[@id='loginbutton']");
//	
	By Flink = By.linkText("Forgotten account?");
	
	@FindBy(id="email") WebElement Unm;
	@FindBy(name="pass")public WebElement Pwd;
	@FindBy(how=How.XPATH,using= "//label[@id='loginbutton']")@CacheLookup public WebElement log;
	
	

	public void Login(String U,String P)
		{
		Unm.sendKeys(U);
		Pwd.sendKeys(P);
		log.click();
		}
	
	public void ForgotPwd()
	{
		driver.findElement(Flink).click();
	}
	
	public void Account()
	{
		//------
		//---------
	}
	
	
	
	
}
