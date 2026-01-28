package pac.Maven_Train;
import java.util.Scanner;
public class Bank_Console_Application {
	Scanner sc=new Scanner(System.in);
	private double balance;
	
	
	Bank_Console_Application(double initial_Balance)
	{
		balance=initial_Balance;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void withdrawl(double amount)
	{
		if(amount>balance)
		{
			throw new ArithmeticException("insufficient amount");
		}
		balance-=amount;
	}
	public double getBalance() 
	{
		return balance;
	}

}
