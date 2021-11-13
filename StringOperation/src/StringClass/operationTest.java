package StringClass;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class operationTest {
	@Test
	void test1()
	{
		operation c = new operation();
		String result = c.conca("Aman","Chaturvedi");
		assertEquals("AmanChaturvedi",result);
	}
	@Test
	void test2() {
		operation sc = new operation();
		assertTrue(sc.comp("aman", "aman"));
	}
	@Test
	void test3()
	{
		operation sc = new operation();
		assertEquals("aman",sc.loww("Aman"));
	}
	@Test
	void test4()
	{
		operation v = new operation();
		assertEquals(4,v.len("Aman"));
	}
	@Test
	void test5() {
		operation sc = new operation();
		assertTrue(sc.emp(""));
	}
}
