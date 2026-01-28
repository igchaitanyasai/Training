package com.example.demo;

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
	public static void main(String[] args) {
	    Bank_Console_Application o = new Bank_Console_Application(1000);

	    System.out.println("Initial Balance: " + o.getBalance());

	    o.deposit(100);
	    System.out.println("After Deposit: " + o.getBalance());

	    o.withdrawl(500);
	    System.out.println("After Withdrawal: " + o.getBalance());
	}

}
