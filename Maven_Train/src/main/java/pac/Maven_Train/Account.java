package pac.Maven_Train;

public class Account {
	int balance;
	public Account(int balance)
	{
		this.balance=balance;
	}
	public void withdraw(int amount)
	{
		if(balance<amount)
		{
			throw new ArithmeticException("Insufficient Balance");
		}
		balance=balance-amount;
	}
}
