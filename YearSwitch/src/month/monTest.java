package month;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
class monTest {	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("		Assignment 2");
		System.out.println("-------------------------------------------------------");
	}
	@Test
	void test() {
		mon obj = new mon();
		
		assertEquals("January",obj.swi(1));
		assertEquals("February",obj.swi(2));
		assertEquals("March",obj.swi(3));
		assertEquals("April",obj.swi(4));
		assertEquals("May",obj.swi(5));
		assertEquals("June",obj.swi(6));
		assertEquals("July",obj.swi(7));
		assertEquals("August",obj.swi(8));
		assertEquals("September",obj.swi(9));
		assertEquals("October",obj.swi(10));
		assertEquals("November",obj.swi(11));
		assertEquals("December",obj.swi(12));
		assertEquals("Invalid",obj.swi(14));
	}

}
