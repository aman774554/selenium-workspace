package number;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class oddevenclassTest {
	@Test
	void test() {
		oddevenclass sc = new oddevenclass();
		assertEquals("odd",sc.oe(sc.in()));
	}

}
