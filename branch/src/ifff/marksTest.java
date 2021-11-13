package ifff;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


class marksTest {

	@Test
	void test() {
		marks m = new marks();
		assertEquals ("A",m.mark(95));
		assertEquals ("B",m.mark(87));
		assertEquals ("C",m.mark(83));
		assertEquals ("D",m.mark(75));
		assertEquals ("E",m.mark(45));
		assertEquals ("F",m.mark(05));
		
	}

}
