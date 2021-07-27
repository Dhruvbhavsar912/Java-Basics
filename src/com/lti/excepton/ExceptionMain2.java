package com.lti.excepton;

public class ExceptionMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Begins");
		int[] nums = {10,20,30};
		int nums1[] = {10,20,30,40,50};
		
		try {
			System.out.println(nums[0]);
			System.out.println(nums1[8]);
			int n= 1/0;
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Array not initialized");
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage()+ " position is not available");
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch (Throwable e) {
			// TODO: handle exception
		}
		System.out.println("MainEnds");
		

	}

}
