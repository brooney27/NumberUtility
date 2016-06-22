import static org.junit.Assert.*;

import org.junit.Test;

public class TestMinOf {

	@Test
	public void testMinOfSame() {
		assertTrue(NumberUtility.minOf(3,3)==3);
	}
	@Test
	public void testMinOfTwoNegative() {
		assertTrue(NumberUtility.minOf(-3,-2)==-3);
	}
	@Test
	public void testMinOfOneNegative() {
		assertTrue(NumberUtility.minOf(-2,3)==-2);
	}
	@Test
	public void testMinOfOneWithZero() {
		assertTrue(NumberUtility.minOf(3,0)==0);
	}
}
