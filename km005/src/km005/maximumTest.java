package km005;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class maximumTest {
	@Test
	void test() {
		maxnum m = new maxnum();
		assertEquals (90,m.findmax(6, 8, 90,3));
		assertEquals (84,m.findmax(6, 84, 9, 3));
		assertEquals (34,m.findmax(34, 8, 9,4));
		assertEquals (456,m.findmax(34, 8, 9,456));
	}

}
