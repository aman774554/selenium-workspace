package Array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class linearTest {

	@Test
	void test() {
		System.out.println("LINEAR SEARCHING");
		assertEquals(1,linear.linear1(new int[]{3,53,23,4,12}));
		
	}

}
