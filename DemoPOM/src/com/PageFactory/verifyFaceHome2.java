package com.PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.ReadExcel;
import jxl.JXLException;

public class verifyFaceHome2 {
	WebDriver driver = null;
	 FacebookHomeElement L1 ;
	 
	 
  @BeforeMethod 
  public void Launch()
  {
	  driver = SelectBrowser.Browser("chrome", "https://www.facebook.com/");
	    
	  // L1 = new FacebookHomeElement(driver);
  
	    L1 = PageFactory.initElements(driver, FacebookHomeElement.class);
  }
	
  @Test (priority = 1 , dataProvider="input")
  public void VLogin(String U,String P) {
	//FacebookHomeElement L1 = new FacebookHomeElement(driver);
		L1.Login(U,P);
  }
  
  @Test(priority = 2)
  public void VForgotPwd()
  {
	  L1.ForgotPwd();
  }
  
  @DataProvider (name="input")
  public Object[][] passData() throws JXLException, IOException
  {
	  ReadExcel e1 = new ReadExcel();
	  int R1 = e1.getRowCount(0);
	  Object [][] data = new Object[R1][2];
	  for(int i=1;i<R1;i++)
	  {
		  data[i][0] = e1.getExcelData(0, i, 0);//read the Unm
		  
		  data[i][1] = e1.getExcelData(0, i, 1);//read the Pwd
	  }
	  return data;
	  
  }
	
	@AfterMethod()
	public void Close()
	{
	driver.close();
	}
}
