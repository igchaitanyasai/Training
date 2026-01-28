package pac.Maven_Train;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.Test;

public class Bank_Console_Application_Test {
	Bank_Console_Application bank=new Bank_Console_Application(1000);
	@Test
	void initial_bal200() {
		assertEquals(200,bank.getBalance());
	}
	@Test
	void initial_bal1000() {
		assertEquals(1000,bank.getBalance());
	}
	
	@Test
	void deposit200() {
		bank.deposit(200);
		assertEquals(1200,bank.getBalance());
	}
	@Test
	void deposit500() {
		bank.deposit(500);
		assertEquals(200,bank.getBalance());
	}
	@Test
	void withdrawl100() {
		bank.withdrawl(100);
		assertEquals(900,bank.getBalance());
	}
	@Test
	void withdrawl500() {
		bank.withdrawl(500);
		assertEquals(1000,bank.getBalance());
	}
	@Test
	void withdrawl1100() {
		assertThrows(ArithmeticException.class,()->{
			bank.withdrawl(1100);
//			This test case passes because withdrawal(1100) throws an ArithmeticException, and assertThrows validates that the expected exception is thrown
		});
	}
	@Test
	void withdrawl1000() {
		assertThrows(ArithmeticException.class,()->{
			bank.withdrawl(1000);
			// This test case fails because withdrawal(1000) does NOT throw an
	        // ArithmeticException when the withdrawal amount is equal to the balance.
	        // The condition in the code checks only for amount > balance, so the method
	        // executes successfully instead of throwing an exception.
		});
	}
}