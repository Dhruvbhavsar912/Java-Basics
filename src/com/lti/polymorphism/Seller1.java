package com.lti.polymorphism;

public class Seller1 extends Amazon {
	


	public Seller1() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	void purchase(double price) {
		// TODO Auto-generated method stub
		double totalprice = price - price * amazonDiscount();
		System.out.println("Amount to be paild to seller1 will be " + totalprice);

	}

}
