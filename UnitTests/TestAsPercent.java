import static org.junit.Assert.*;

import org.junit.Test;

public class TestAsPercent {

	@Test
	public void testAsPercentZero() {
		assertTrue(NumberUtility.asPercent(0).equals("0%"));
	}
	@Test
	public void testAsPercentDecimal() {
		assertTrue(NumberUtility.asPercent(.05).equals("5%"));
	}
	@Test
	public void testAsPercentBig() {
		assertTrue(NumberUtility.asPercent(2).equals("200%"));
	}
	@Test
	public void testAsPercentFraction() {
		assertTrue(NumberUtility.asPercent(.025).equals("2.5%"));
	}
	@Test
	public void testAsPercentRoundUp() {
		System.out.println(NumberUtility.asPercent(.02006));
		assertTrue(NumberUtility.asPercent(.02006).equals("2.01%"));
	}
}
