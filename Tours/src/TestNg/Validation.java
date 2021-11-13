package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation {
  @Test
  public void check() {
	  
	  String s1 = "Hello";
	  String s2 = "hello";
	  
	  Assert.assertEquals(s1,s2);
	  
	  //Assert.assertTrue(12<10,"Invalid Result");
	  
	  //Assert.assertTrue(s1==s2, "Invalid Result");
	  
	  //Assert.fail("Error plzz check..");
	  
	  System.out.println("done...");
  }
}
