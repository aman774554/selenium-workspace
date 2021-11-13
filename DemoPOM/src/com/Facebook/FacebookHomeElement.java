package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookHomeElement {
	WebDriver driver;
	
	public FacebookHomeElement(WebDriver driver1)
	{
		driver = driver1;
	}
  

	By Unm = By.id("email");
	By Pwd = By.id("pass");
	By log = By.xpath("//label[@id='loginbutton']");
	
	By Flink = By.linkText("Forgotten account?");
	
	//public void Login()
	//{
		//driver.findElement(Unm).sendKeys("A1@gmail.com");
		//driver.findElement(Pwd).sendKeys("test");
		//driver.findElement(log).click();
	//}
	
	public void Login(String U,String P)
		{
			driver.findElement(Unm).sendKeys(U);
			driver.findElement(Pwd).sendKeys(P);
			driver.findElement(log).click();
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
