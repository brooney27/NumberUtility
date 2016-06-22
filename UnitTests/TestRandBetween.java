import static org.junit.Assert.*;

import org.junit.Test;

public class TestRandBetween {

	@Test
	public void testBetweenSame() {
		assertTrue(NumberUtility.randBetween(1, 1)==1);
	}
	@Test
	public void testCoinFlip() {
		int num = NumberUtility.randBetween(0, 1);
		assertTrue(num==1||num==0);
	}
	@Test
	public void testBetweenBackwards() {
		int num = NumberUtility.randBetween(1, 0);
		assertTrue(num==1||num==0);
	}
	@Test
	public void testRandWithOffset() {
		int num = NumberUtility.randBetween(2, 3);
		assertTrue(num==3||num==2);
	}
	@Test
	public void testRandWithNegative() {
		int num = NumberUtility.randBetween(-2, -1);
		assertTrue(num==-1||num==-2);
	}
}
