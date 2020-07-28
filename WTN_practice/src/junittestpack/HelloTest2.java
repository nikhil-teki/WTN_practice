package junittestpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest2 {

	@Test
	public void testPrint() {
		Hello h=new Hello();
		assertEquals("Hello World",h.print());
	}

}
