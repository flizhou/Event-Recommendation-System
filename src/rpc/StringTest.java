package rpc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringTest {
	@Test
	public void testSubString() {
		String str = new String("This is a unit test.");
		assertEquals("units", str.substring(10, 14));
	}
}
