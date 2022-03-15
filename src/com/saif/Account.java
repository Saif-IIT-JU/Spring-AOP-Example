package com.saif;

public class Account {
	private String name;
	private int balance;
	
	static final Account obj = new Account();
	public static Account getAccount()
	{
		return obj;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public int getBalance()
	{
		return balance;
	}
	public void increaseBalanceBy(int amount)
	{
		balance+=amount;
	}
	public void decreaseBalanceBy(int amount)
	{
		balance-=amount;
	}
	
	public void showBalance()
	{
		System.out.println("Current balance is : " + this.balance);
	}
}
