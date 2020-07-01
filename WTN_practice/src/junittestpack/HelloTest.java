package junittestpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testPrint() {
		Hello h=new Hello();
		assertEquals("Hello World",h.print());
	}

}
