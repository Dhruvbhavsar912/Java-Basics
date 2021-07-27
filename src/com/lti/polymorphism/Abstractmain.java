package com.lti.polymorphism;

import java.util.Scanner;

public class Abstractmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon amazon = null;
		
		System.out.println("1.Seller1 2.Seller2");
		
		
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		
		if (ch==1)
		{
			amazon =new Seller1();
		}
		else if (ch==1)
		{
			amazon =new Seller2();
		}
		
		amazon.purchase(5000); // rutime 
		
		
		// Compile time 
		// Seller1 seller1 = new Seller1();
		// seller1.purchase(5000);
		
	}

}
