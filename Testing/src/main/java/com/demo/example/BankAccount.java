package com.demo.example;

public class BankAccount {

	private double balance;
	private  double minimumBalance;
	
	public BankAccount(double balance, double minimumBalance) {
		super();
		this.balance = balance;
		this.minimumBalance = minimumBalance;
	}
	
	
	public double withdraw(double amount) {
		
		if(balance-amount>minimumBalance)			
			return balance -= amount;	
		throw new RuntimeException();
	}
	
	
	public double deposit(double amount) {
		 return balance += amount ;	
		}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	
}
