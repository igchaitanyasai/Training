package pac.Maven_Train;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPrimeNumber {
	
	@Test
	void TestPrimeNumber5() {
		assertEquals(true, PrimeNUmber.prime(5));
	}
	
	@Test
	void TestPrimeNumber10() {
		assertEquals(true, PrimeNUmber.prime(10));
	}
}
