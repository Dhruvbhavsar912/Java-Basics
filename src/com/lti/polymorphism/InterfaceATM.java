package com.lti.polymorphism;

import java.util.Scanner;

public class InterfaceATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.ICICI \n2. SBI \nSelect You card");

		Scanner sc = new Scanner(System.in);
		
		ATM atm = null;
		
		int ch = sc.nextInt();
		
		if (ch==1)
		{
			atm =new IciciATM();
		}
		else if (ch==2)
		{
			atm =new SBIATM();
		}
		 
		atm.withdraw(3000);
		System.out.println(atm.checkBalance()); // rutime
		
	}

}
