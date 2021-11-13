package lowertoupper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class lowtouppTest {

	@Test
	void test() {
		lowtoupp c = new lowtoupp();
		String result = c.loww("aman");
		assertEquals("AMAN",result);
	}

}
