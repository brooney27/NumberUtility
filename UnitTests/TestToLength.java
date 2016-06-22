import static org.junit.Assert.*;

import org.junit.Test;

public class TestToLength {

	@Test
	public void testToLengthZero() {
		assertTrue(NumberUtility.toLength(0, 2).equals("0.00"));
	}
	@Test
	public void testToLengthBasic() {
		assertTrue(NumberUtility.toLength(1.05, 2).equals("1.05"));
	}
	@Test
	public void testToLengthNegative() {
		assertTrue(NumberUtility.toLength(-1.05, 2).equals("-1.05"));
	}
	@Test
	public void testToLengthThree() {
		assertTrue(NumberUtility.toLength(1.055, 3).equals("1.055"));
	}
	@Test
	public void testToLengthRound() {
		assertTrue(NumberUtility.toLength(1.055, 2).equals("1.06"));
	}
}
