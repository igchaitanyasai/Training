package pac.Maven_Train;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AccountTest {
	@Nested
	class WithDrawSufficientBalance{
		@Test
		@Tag("integration")
		void Test1() {
			Account account = new Account(10000);
			account.withdraw(6000);
			assertEquals(4000,account.balance);
		}
		@Tag("fast")
		@Test
		void Test2() {
			Account account = new Account(10000);
			assertThrows(ArithmeticException.class, ()->account.withdraw(12000));
		}
	}
	@Nested
	class WithDrawInSufficientBalance{
		@Test
		@Tag("fast")
		void Test3() {
			Account account = new Account(10000);
			assertThrows(ArithmeticException.class, ()->account.withdraw(12000));
		}
	}
}