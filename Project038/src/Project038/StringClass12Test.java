package Project038;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringClass12Test {

	@Test
	void test() {
		StringClass12 sc = new StringClass12();
		assertTrue(sc.eq("eclipse", "eclipse"));
		
	}
	
	@Test
	void test1() {
		StringClass12 sc = new StringClass12();
		assertEquals("Welcome",sc.strcon("Wel","come"));
		
	}

}
