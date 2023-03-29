package com.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.demo.example.BankAccount;

public class BankAccountTest {

	
	private BankAccount bankAccount = new BankAccount(500, 0);
	
	@Test
	@DisplayName("Withdraw Amount")
	public void testWithdraw() {
		// TODO Auto-generated method stub
			assertEquals(400, bankAccount.withdraw(100));
	}
	
	@Test
	@DisplayName("Deposit Amount")
	public void testDeposit() {
		// TODO Auto-generated method stub
			assertEquals(600, bankAccount.deposit(100));
	}
}
