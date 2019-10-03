import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class crapsTest
{

	@Test
	void testOverride() {
		Die die1 = new CrookedDie1();
		assertEquals("Die.testStatic()",die1.testStatic());
	}

}
