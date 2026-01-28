package pac.Maven_Train;

public class BankAccTranfer {
	String name;
	int balance;
	BankAccTranfer(String name,int balance)
	{
		this.balance=balance;
		this.name=name;
	}
	void transfer(BankAccTranfer receiver,int amount) {
		this.balance-=amount;
		receiver.balance+=amount;
	}
}
