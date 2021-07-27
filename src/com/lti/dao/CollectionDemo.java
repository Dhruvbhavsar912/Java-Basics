package com.lti.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.lti.model.Student;


public class CollectionDemo {

	public static void  main(String[] args) {

		
		
//		List<Student> students= new ArrayList<Student>();
//		students.add(new Student(1,"john",LocalDate.of(2003,01,01)));
//		students.add(new Student(2,"Bob",LocalDate.of(2001,01,01)));
//		students.add(new Student(3,"Mark",LocalDate.of(2002,01,01)));
//		students.add(new Student(4,"Kevin",LocalDate.of(2000,01,01)));
//
//		Student st=new Student(4,"Kevin", LocalDate.of(2000, 01, 01));
//		System.out.println(students.indexOf(st));
//		
//		List<Integer> nums= new ArrayList<Integer>();
//		nums.add(10);
//		nums.add(20);
//		nums.add(30);
//		nums.add(40);
//		
//		System.out.println(nums.indexOf(30));

		
		
//		Hashset
//		Set<String> names = new HashSet<String>(); //one null value is allowed & it is not sorted
//		Treeset
		Set<String> names = new TreeSet<String>(); // no null values are allowed & and it is sorted
		
		names.add(new String("dhruv"));
		names.add(new String("abc"));
		names.add(new String("xyz"));
		names.add(new String("sam"));
		names.add(new String("john"));
		
		System.out.println(names);
//		
//		//System.out.println(names.contains("Dhruv2"));
//		
//		names.remove("abc");
//		System.out.println(names);
		
// 		HashMap
		
//		Map<Integer, String> credentials = new HashMap<Integer,String>();
//
//		credentials.put(1001, "pass@123");
//		credentials.put(1002, "pass@113");
//		credentials.put(1003, "pass@133");
//		credentials.put(1004, "pass@223");
//		credentials.put(1005, "pass@243");
		
		Map<Integer, String> credentials = new TreeMap<Integer,String>();

		credentials.put(1001, "pass@123");
		credentials.put(1002, "pass@456");
		credentials.put(1003, "pass@786");
		credentials.put(1004, "pass@223");
		credentials.put(1005, "pass@243");
		
		
		System.out.println(credentials);
		
		//There are two methods to traverse 1. entrySet() 2. keySet()
		
		Set<Entry<Integer, String>> entrySet=credentials.entrySet(); // to convert map into set
		
		
		
		 Iterator<Entry<Integer, String>> iterator =entrySet.iterator();
		 
		 while(iterator.hasNext())
		 {
			 Entry<Integer,String> item = iterator.next();
			 System.out.println(item.getValue()+" "+ item.getKey());
		 }
		
		 Iterator<String> allnames = names.iterator();
		 while(allnames.hasNext())
		 {
			 String item = allnames.next();
			 System.out.println(item);
		 }
		 
		
		
	}

}