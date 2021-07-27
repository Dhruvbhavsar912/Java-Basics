package com.lti.excepton;

import java.util.Scanner;

public class ExceptionMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Begins");
		int[] nums = {10,20,30};
		int nums1[] = {10,20,30,40,50};
		
		try {
			System.out.println(nums[0]);
			System.out.println(nums1[2]);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Array not initialized");
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage()+ " position is not available");
			
		} finally
		{
			System.out.println("Finally Executed");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
		if (age<0)
		{
			try {
				throw new NegativeAgeException("Age cannot be negative");
			} catch (NegativeAgeException e) {
				// TODO Auto-generated catch block
				System.out.println("Age cannot be negative");
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Your age is "+ age);
		}
		
		
		System.out.println("MainEnds");
		
		

	}

}
