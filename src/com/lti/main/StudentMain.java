package com.lti.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.lti.dao.InMemoryStudentDaoimpl;
import com.lti.dao.PersistentStudentDaoImpl;
import com.lti.dao.StudentDao;
import com.lti.model.Course;
import com.lti.model.Student;



public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StudentDao studentdao = new InMemoryStudentDaoimpl();

		StudentDao studentdao = new PersistentStudentDaoImpl();
		
		
		boolean flag=true;
		do {
			System.out.println("1.Add a Student \n2. Update a Student \n3. Remove a Student \n4. Search aStudent \n5. View All Students \n6.Enroll \n7.View All Enrollments");
			
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			int id;
			String name;
			String date;
			DateTimeFormatter formatter;
			LocalDate dateOfBirth;
			switch(ch)
			{
			case 1:
//				System.out.println("Enter you id, name, dateOfBirth(dd/MM/uuuu) ");
//				id = sc.nextInt();

				System.out.println("Enter you Name, dateOfBirth(dd/MM/uuuu) ");
				name = sc.next();
				date = sc.next();
				formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
				dateOfBirth = LocalDate.parse(date, formatter);
				
				Student student = new Student();
				student.setName(name);
				student.setDateOfBirth(dateOfBirth);
				boolean res = studentdao.addAStudent(student);
				if (res)
				{
					System.out.println("Data Inserted Sucessfully");
				}
				else{
					System.out.println("Sorry! Registration Failed");
				}
				
				break;
			case 2:
//				System.out.println("Enter you id, name, dateOfBirth(dd/MM/uuuu) for update");
//				

				System.out.println("Enter your id, Name, dateOfBirth(dd/MM/uuuu) ");
				id = sc.nextInt();
				name = sc.next();
				date = sc.next();
				formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
				dateOfBirth = LocalDate.parse(date, formatter);

				//student = new Student(id,name,dateOfBirth);

				student = new Student();
				student.setName(name);
				student.setDateOfBirth(dateOfBirth);
				studentdao.updateAStudent(student,id);
							
				break;
			case 3:
				System.out.println("Enter a Student id you want to remove");
				id = sc.nextInt();
				studentdao.removeAStudent(id);				
				break;
			case 4:
				System.out.println("Enter a Student id you want to get details of");
				id = sc.nextInt();
				Student st1 = studentdao.findStudent(id);
				if (st1!=null)
				{
				System.out.println(st1.getId()+ " " + st1.getName() + " " + st1.getDateOfBirth());		
				}
				else {
					System.out.println("Student Not Found");
				}
				break;
			case 5:
				List<Student> students= studentdao.viewAllStudent();
				if(students.isEmpty())
				{
					System.out.println("Student Not Found");
				}
				else {
				for(Student st : students)
				{
					System.out.println(st.getId()+ " " + st.getName() + " " + st.getDateOfBirth());
				}
				}
				break;
			case 6:
				System.out.println("Enter studentid and courseid");
				int StudentId = sc.nextInt();
				int CourseId = sc.nextInt();
				studentdao.enroll(StudentId,CourseId);
				break;
			case 7:
				Set<Entry<Student, Course>> enrollments = studentdao.viewEnrollments();
				Iterator<Entry<Student, Course>> allEnrollments = enrollments.iterator();
			
				 while(allEnrollments.hasNext())
				 {
					 Entry<Student, Course> enrollment = allEnrollments.next();
					 Student st = enrollment.getKey();
					 Course cs = enrollment.getValue();
					 System.out.println(st.getId()+" "+ st.getName()+ " "+ cs.getName()); 
				 }
				break;
			default:
				flag= false;
				break;
			
			}
						
		}while(flag);

	}

}
