package concat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class concatclassTest {

	@Test
	void test() {
		concatclass c = new concatclass();
		String result = c.concatenate("one","two");
		assertEquals("onetwo",result);
		
	}

}
