package com.lti.main;

import com.lti.model.Course;
import com.lti.model.DegreeCourse;
import com.lti.model.DegreeLevel;
import com.lti.model.DiplomaCourse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.model.Course;
import com.lti.model.Student;
import com.lti.model.Type;

public class App {
	
	public static void main(String[] args) {

		scenario9();
		
	}
	
	public static void scenario1() {
		String[] stud2phoneNumber = { "7768952344", "9689572344" };
		String[] stud3phoneNumber = { "9867532155", "9968532489" };

		Student student = new Student();
		Student student2 = new Student(101, "John", LocalDate.now(), stud2phoneNumber);
		Student student3 = new Student(102, "Raj", LocalDate.of(2021, 06, 21), stud3phoneNumber);

		Info info = new Info();

		info.display(student2);
		info.display(student3);

	}

	public static void scenario2() {

		Student[] students = new Student[3];
		String[] stud2phoneNumber = { "7768952344", "9689572344" };
		String[] stud3phoneNumber = { "9867532155", "9968532489" };
		String[] stud1phoneNumber = { "9267532155", "9458532489" };

		students[0] = new Student(101, "John", LocalDate.now(), stud2phoneNumber);
		students[1] = new Student(102, "Raj", LocalDate.of(2021, 06, 21), stud3phoneNumber);
		students[2] = new Student(103, "Amit", LocalDate.of(2021, 07, 07), stud1phoneNumber);

		Info info = new Info();

		info.display(students);

	}
	

	public static void scenario3() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int noOfStudents = sc.nextInt();

		Student[] students = new Student[noOfStudents];
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter you id, name, dateOfBirth(dd/MM/uuuu)");
			int id = sc.nextInt();
			String name = sc.next();
			String date = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
			LocalDate dateOfBirth = LocalDate.parse(date, formatter);
			System.out.println("Enter Number of Phone Numbers");
			int noOfPhoneNumbers = sc.nextInt();
			String[] phone = new String[noOfPhoneNumbers];
			for (int j = 0; j < noOfPhoneNumbers; j++) {
				phone[j] = sc.next();
			}
			students[i] = new Student(id, name, dateOfBirth, phone);
		}

		Info.display(students);
		
	}
	
	public static void scenario4() {
		List<Student> students = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter you id, name, dateOfBirth(dd/MM/uuuu)");
			int id = sc.nextInt();
			String name = sc.next();
			String date = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
			LocalDate dateOfBirth = LocalDate.parse(date, formatter);
			System.out.println("Enter Number of Phone Numbers");
			int noOfPhoneNumbers = sc.nextInt();
			String[] phone = new String[noOfPhoneNumbers];
			for (int j = 0; j < noOfPhoneNumbers; j++) {
				phone[j] = sc.next();
			}
			students.add(new Student(id, name, dateOfBirth, phone));
			System.out.println("Press 0 to stop? else Press 1");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
		} while (true);

		Info.display(students);

	}
	
//	public static void scenario5() {
//
//		Course course = new Course(1,"BE",4,50000.0);
//		Course course2 = new Course(2,"ME",2,51200.0);
//		Course course3 = new Course(3,"PHD",5,80000.0);
//
//		Info info = new Info();
//
//		info.display1(course2);
//		info.display1(course3);
//
//	}
//
//	public static void scenario6() {
//
//		Course[] courses = new Course[3];
//		
//		courses[0]= new Course(1,"BE",4,50000.0);
//		courses[1]= new Course(2,"ME",2,51200.0);
//		courses[2]= new Course(3,"PHD",5,80000.0);
//
//
//		Info info = new Info();
//
//		info.display1(courses);
//
//	}
//	
//
//	public static void scenario7() {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter number of courses");
//		int noOfcourses = sc.nextInt();
//
//		Course[] courses = new Course[noOfcourses];
//		
//		for (int i = 0; i < courses.length; i++) {
//			System.out.println("Enter you id, name,duration and fees ");
//			int id = sc.nextInt();
//			String name = sc.next();
//			int duration = sc.nextInt();
//			double fees = sc.nextDouble();
//			
//			courses[i] = new Course(id, name, duration,fees);
//		}
//
//		Info.display1(courses);
//		
//	}
//	
//	public static void scenario8() {
//		List<Course> courses = new ArrayList<Course>();
//
//		Scanner sc = new Scanner(System.in);
//
//		do {
//			System.out.println("Enter you id, name,duration and fees ");
//			int id = sc.nextInt();
//			String name = sc.next();
//			int duration = sc.nextInt();
//			double fees = sc.nextDouble();
//			courses.add(new Course(id, name, duration,fees));
//			System.out.println("Press 0 to stop? else Press 1");
//			int num = sc.nextInt();
//			if (num == 0) {
//				break;
//			}
//			
//		} while (true);
//		Info.display1(courses);
//
//	}
	
	public static void scenario9() {
		DegreeCourse degreeCourse = new DegreeCourse(101,"Btech",96,1000000,DegreeLevel.Bachelors,true);
		DiplomaCourse diplomaCourse = new DiplomaCourse(201,"Diploma1",4,50000,Type.Academic);
		
		Info.displayCourse(degreeCourse);
		Info.displayCourse(diplomaCourse);
	}
	
}
