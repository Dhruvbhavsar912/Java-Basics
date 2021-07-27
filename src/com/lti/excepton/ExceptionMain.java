package com.lti.excepton;

import java.util.Scanner;

public class ExceptionMain {
	
	static int result =0;
	
	static int [] arr =new int[] {10,20,30,40,50};

	public static void main(String[] args) {

		System.out.println("Main Begin");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(divide(num1,num2));
		
		System.out.println("Enter Position");
		int i;
		i= sc.nextInt();
		
		int k=getElement(i);
		if (k!=-1)
		{
			System.out.println(getElement(i));
			
		}
		
		
				
		System.out.println("Main Ends");

	}
	
	public static int divide(int num1,int num2)
	{	
		try {
			result= num1/num2;
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Cannot divide by zero. ");

		}
		return result;
	}
	
	public static int getElement(int index)
	{	
		try {
		return arr[index];
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Index Out of Bound Exception");
		}
		return -1;
	}

}
