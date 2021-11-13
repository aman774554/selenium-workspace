package strcompare;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class compareTest {

	@Test
	void test() {
		compare sc = new compare();
		assertTrue(sc.comp("aman", "aman"));
	}

}
