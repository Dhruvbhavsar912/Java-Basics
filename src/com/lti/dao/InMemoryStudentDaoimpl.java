package com.lti.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.lti.model.Course;
import com.lti.model.Student;

public class InMemoryStudentDaoimpl implements StudentDao {

	static List<Student> students = new ArrayList<Student>();

	static Set<Course> courses = new HashSet<Course>();

	static Map<Student, Course> enrollments = new HashMap<>();

	public InMemoryStudentDaoimpl() {

		students.add(new Student(1, "Sam", LocalDate.of(2000, 12, 07)));
		students.add(new Student(2, "John", LocalDate.of(2001, 11, 07)));
		students.add(new Student(3, "Jack", LocalDate.of(2002, 10, 07)));
		students.add(new Student(4, "Dhruv", LocalDate.of(2003, 02, 07)));

		courses.add(new Course(1001, "Java", 4, 3000.0));
		courses.add(new Course(1002, "Python", 5, 7000.0));
		courses.add(new Course(1003, "PHP", 6, 9000.0));
		courses.add(new Course(1004, "C++", 8, 12000.0));
	}

	@Override
	public boolean addAStudent(Student student) {
		return students.add(student);
	}

	@Override
	public void updateAStudent(Student student,int id) {

		Student existingStudent = findStudent(student.getId());

		if (existingStudent != null) {
			int position = students.indexOf(existingStudent);
			students.set(position, student);
			System.out.println("Student Updated Successfully");
		} else {
			System.out.println("Student Not found");
		}

	}

	@Override
	public void removeAStudent(int id) {
		// TODO Auto-generated method stub
		Student existingStudent = findStudent(id);

		if (existingStudent != null) {
			int position = students.indexOf(existingStudent);
			students.remove(position);
			System.out.println("Student removed Successfully");
		} else {
			System.out.println("Student Not found");
		}

	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub

		for (Student st : students) {
			if (st.getId() == id) {
				return st;
			}
		}

		return null;
	}

	@Override
	public List<Student> viewAllStudent() {
		// TODO Auto-generated method stub

		return students;
	}

	@Override
	public void enroll(int studentId, int courseId) {

		Student student = findStudent(studentId);
		Course course = findCourse(courseId);
		if (student != null || course != null) {
			enrollments.put(student, course);
			System.out.println("Enrolled Successfilly");
		} else {
			System.out.println("Course or Student not found");
		}

	}

	@Override
	public Course findCourse(int id) {

		for (Course cs : courses) {
			if (cs.getId() == id) {
				return cs;
			}
		}

		return null;
	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {

		return enrollments.entrySet();
	}

}
