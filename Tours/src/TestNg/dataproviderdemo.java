package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {
  @Test(dataProvider="data")
  public void Demo(Integer n,String s) {
	  
	  System.out.println(n +" "+s);
	  
  }
  
  @DataProvider(name="data" )
  public Object[][] output()
  {
	  
	  return new Object[][]
			  {
		  {1,"aaa"},
		  {2,"bbb"},
		  {3,"ccc"}
			  };
  }
}
