package pac.Maven_Train;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTransfer {

	@Test
	void TestTransferingAmount() {
		BankAccTranfer sender=new BankAccTranfer("Jackson",1000);
		BankAccTranfer receiver=new BankAccTranfer("Slum",2000);
		sender.transfer(receiver,200);
		assertEquals(800,sender.balance);
		assertEquals(2200,receiver.balance);
	}
}
