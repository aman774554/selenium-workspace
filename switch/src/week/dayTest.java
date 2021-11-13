package week;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class dayTest {
	@Test
	void test() {
		day obj = new day();
		assertEquals("Sunday",obj.swi(0));
		assertEquals("Monday",obj.swi(1));
		assertEquals("Tuesday",obj.swi(2));
		assertEquals("Wednesday",obj.swi(3));
		assertEquals("Thursday",obj.swi(4));
		assertEquals("Friday",obj.swi(5));
		assertEquals("Saturday",obj.swi(6));
		assertEquals("Invalid",obj.swi(8));
	}

}
