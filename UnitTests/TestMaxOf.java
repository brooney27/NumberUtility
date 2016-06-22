import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaxOf {

	@Test
	public void testMaxOfSame() {
		assertTrue(NumberUtility.maxOf(3,3)==3);
	}
	@Test
	public void testMaxOfTwoNegative() {
		assertTrue(NumberUtility.maxOf(-3,-2)==-2);
	}
	@Test
	public void testMaxOfOneNegative() {
		assertTrue(NumberUtility.maxOf(-3,2)==2);
	}
	@Test
	public void testMaxOfOneWithZero() {
		assertTrue(NumberUtility.maxOf(-3,0)==0);
	}
}
