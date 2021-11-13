package testing;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testfile {
/*	@Test
	public void test() {
		claculate calci = new claculate();
		
		int a = 10;
		int b= 10;
		int actual = calci.multiplication(a,b);
		int expected = 100;
		assertEquals(expected, actual);
	}
	@Test
	public void test2() {
	claculate calci = new claculate();
	
	int a = 100;
	int b= 10;
	int actual = calci.division(a,b);
	int expected = 10;
	assertEquals(expected, actual);
}
	@Test
	public void test3() {
	claculate calci = new claculate();
	
	int a = 70;
	int b= 30;
	int actual = calci.add(a,b);
	int expected = 100;
	assertEquals(expected, actual);
	//assertTrue(actual==120);
	
}
	@Test
	public void test4() {
	claculate calci = new claculate();
	
	int a = 40;
	int b= 30;
	int actual = calci.subtract(a,b);
	int expected = 10;	
	assertEquals(expected, actual);
}*/
	@Test
	public void test() {
		claculate calci = new claculate();
		assertEquals(100, calci.multiplication(10,10));
		assertEquals(20, calci.add(10,10));
		assertEquals(0, calci.subtract(10,10));
		assertEquals(1, calci.division(10,10));
	}

}
