package com.lti.string;

public class StrinDemo {

	public static void main(String[] args) {
		
		String str1 = new String("LTI");
		String str2 = new String("LTI");
		
		// equals(), ==
//
//		System.out.println(str1==str2); //checks the references
//		System.out.println(str1.equals(str2)); //checks the values
//
//		String str3 = "Dhruv";
//		String str4 = "Dhruv";
//		String str5 = new String("Dhruv");
//		
//		System.out.println(str3==str4);
//		System.out.println(str3.equals(str4));
//		System.out.println(str3==str5);
//		System.out.println(str3.equals(str5));
//		
		String str3 = "LTI";
		String str4 = "LTI";
		//str3.concat(str4);
		str3= str3 + "-L&T";

		System.out.println(str3==str4);
		System.out.println(str3);
		
		
		
		
	}

}
