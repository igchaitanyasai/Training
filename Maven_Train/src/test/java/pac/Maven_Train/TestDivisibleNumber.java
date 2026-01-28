package pac.Maven_Train;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDivisibleNumber {
	@Test
	void ShouldReturnFizzBizzTest() {
		assertEquals("fizz bizz",DivisibleNUmber.checkNumber(15));
	}
	@Test
	void ShouldReturnFizzTest() {
		assertEquals("fizz",DivisibleNUmber.checkNumber(10));
	}
	@Test
	void ShouldReturnBizzTest() {
		assertEquals("bizz",DivisibleNUmber.checkNumber(9));
	}
	@Test
	void ShouldNotReturnAnyWordReturnNUmber() {
		assertEquals("14",DivisibleNUmber.checkNumber(14));
	}
}
