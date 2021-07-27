package com.lti.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.lti.model.Course;
import com.lti.model.DegreeCourse;
import com.lti.model.DiplomaCourse;
import com.lti.model.Student;

public class Info {

	public static void display(Student student) {
		// System.out.println(student.getId() + " " + student.getName() + " " +
		// student.getDateOfBirth() + " " + student.getCollegeName() );

		System.out.println(student.getId() + " " + student.getName() + " " + student.getDateOfBirth() + " "
				+ Student.getCollegeName() + " " + Arrays.toString(student.getPhoneNumber()));

	}

	public static void display(Student[] students) {

		/*
		 * for (int i=0;i<student.length;i++) { display(student[i]); }
		 */
		// enhance / extended for loop
		for (Student st : students) {
			display(st);
		}
	}

	public static void display(List<Student> students) {

//		for(Student st : students)
//		{
//			display(st);	
//		}

//		Iterator can change the values and it can also be used to fetch previous element

		ListIterator<Student> studs1 = students.listIterator();
		while (studs1.hasNext()) {
			Student st = studs1.next();
			display(st);
		}
		System.out.println("--------------------------");
		
		while (studs1.hasPrevious()) {
			Student st1 = studs1.previous();
			display(st1);
		}

		
		
	}
	
	

//	public static void display1(Course course) {
//		// System.out.println(student.getId() + " " + student.getName() + " " +
//		// student.getDateOfBirth() + " " + student.getCollegeName() );
//
//		//System.out.println(course.getId() + " " + course.getName() + " " + course.getDuration() + " " + course.getFees() );
//
//	}
//
//	public static void display1(Course[] courses) {
//
//		/*
//		 * for (int i=0;i<student.length;i++) { display(student[i]); }
//		 */
//		// enhance / extended for loop
//		for (Course cs : courses) {
//			display1(cs);
//		}
//	}
//
//	public static void display1(List<Course> courses) {
//
//
////		Iterator can change the values and it can also be used to fetch previous element
//		
//		ListIterator<Course> course1 = courses.listIterator();
//		while (course1.hasNext()) {
//			Course cs = course1.next();
//			display1(cs);
//		}
//		System.out.println("--------------------------");
//		while (course1.hasPrevious()) {
//			Course cs1 = course1.previous();
//			display1(cs1);
//		}
//				
//		
//	}
	
	public static void displayCourse(Course course) {
		course.calculateMonthlyFee();
	}
	
	

}
