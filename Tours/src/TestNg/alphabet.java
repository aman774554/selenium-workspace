package TestNg;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alphabet {
  @Test(priority=1)
  public void Login2() {
	  System.out.println("Login... Done");
	  AssertJUnit.assertEquals("A", "A");
  }
  
  @Test (priority=2)
  public void Book2() {
	  System.out.println("Bookingin... Done");
	  AssertJUnit.assertEquals("B", "B");
  }
  
  @Test (priority=3)
  public void Logout2() {
	  System.out.println("Logout... Done");
	  AssertJUnit.assertEquals("C", "C");
  }
  
  
  
}
