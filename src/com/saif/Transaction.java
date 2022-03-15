package com.saif;

public class Transaction {
	private Account a;
	
	
	public void setA(Account a)
	{
		this.a = a;
	}
	public void displayMessage()
	{
		System.out.println("Transaction is processing...");
	}
	public void Deposite(int amount)
	{
		a.increaseBalanceBy(amount);
		System.out.println(amount + " tk has been deposited.");
	}
	public void withdraw(int amount)
	{
		if(a.getBalance()<amount) {
			System.out.println("Sorry! You don't have sufficient balance.");
		}
		else {
			a.decreaseBalanceBy(amount);
			System.out.println("You have withdrawn of tk " + amount);
		}
	}
	public void showBalance() {
		a.showBalance();
	}
	
}
