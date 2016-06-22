import static org.junit.Assert.*;

import org.junit.Test;

public class TestAsCurrency {

	@Test
	public void testAsCurrencyZero() {
		assertTrue(NumberUtility.asCurrency(0).equals("$0.00"));
	}
	@Test
	public void testAsCurrencyNegative() {
		assertTrue(NumberUtility.asCurrency(-1).equals("-$1.00"));
	}
	@Test
	public void testAsCurrencyRound() {
		assertTrue(NumberUtility.asCurrency(1.055).equals("$1.06"));
	}
}
