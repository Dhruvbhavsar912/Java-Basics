package com.lti.wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

	public static void main(String[] args) {

		int num=10;
		Integer inum=num; // boxing
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(inum); 
		nums.add(20);
		nums.add(num);   // autoboxing
		
		
		
		nums.add(new Integer(50));
		
		System.out.println(nums);
		
		Double salary = new Double(500.68);
		
		double sal = salary.doubleValue(); //unboxing
		System.out.println(sal);
	}

}
