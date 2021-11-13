package minimumIfElse;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
class minTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("		Assignment 2");
		System.out.println("-------------------------------------------------------");
	}

	@Test
	void test() {
		min obj = new min();
		assertEquals (1,obj.findmin(1, 5, 2, 3, 4));
		assertEquals (1,obj.findmin(5, 1, 2, 3, 4));
		assertEquals (1,obj.findmin(2, 5, 1, 3, 4));
		assertEquals (1,obj.findmin(3, 5, 2, 1, 4));
		assertEquals (1,obj.findmin(4, 5, 2, 3, 1));
		
		assertEquals (1,obj.findmin(1, 1, 3, 4, 5));
	}

}
