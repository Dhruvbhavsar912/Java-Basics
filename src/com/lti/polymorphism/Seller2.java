package com.lti.polymorphism;

public class Seller2 extends Amazon {
	


	public Seller2() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	void purchase(double price) {
		// TODO Auto-generated method stub
		double totalprice = price - price * amazonDiscount() -Seller2Discount();
		System.out.println("Amount to be paild to seller2 will be " + totalprice);

	}
	
	private double Seller2Discount() {
		return 0.02;
		
	}

}
