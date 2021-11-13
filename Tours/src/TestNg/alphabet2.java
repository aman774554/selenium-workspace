package TestNg;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alphabet2 {
  @Test(priority=1)
  public void Login() {
	  System.out.println("Login... Done");
	  AssertJUnit.assertEquals("A", "A");
  }
  
  @Test (priority=2)
  public void Book() {
	  System.out.println("Bookingin... Done");
	  AssertJUnit.assertEquals("B", "B");
  }
  
  @Test(priority=3)
  public void Logout() {
	  System.out.println("Logout... Done");
	  AssertJUnit.assertEquals("C", "C");
  }
  
  
  
}
