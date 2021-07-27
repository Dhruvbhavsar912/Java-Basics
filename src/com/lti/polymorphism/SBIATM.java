package com.lti.polymorphism;

public class SBIATM implements ATM {
	
	private double balance=10000;
	private double amount;
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		this.amount=amount;
		System.out.println("Amount withdrawn from SBI " + amount);

	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return balance-amount;
	}

}
