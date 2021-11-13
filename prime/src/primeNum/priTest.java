package primeNum;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
class priTest {

	@Test
	void test() {
		pri m = new pri();
		assertEquals ("Prime",m.prim(7));
		assertEquals ("Not Prime",m.prim(4));
	}

}
