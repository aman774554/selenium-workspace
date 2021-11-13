package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class groupTest {
	  @Test(groups= {"smoke"})
	  public void A() {

		    System.out.println("A done..");
	  }
	  
	  @Test(groups= {"Reg" , "Fun"})
	  public void B() {

		    System.out.println("B done..");
	  }
	  
	  @Test(groups= {"smoke"})
	  public void C() {

		    System.out.println("C done..");
	  }
	  
	  @Test(groups= {"Fun" , "smoke"})
	  public void D() {

		    System.out.println("D done..");
	  }
	  
	 
}
