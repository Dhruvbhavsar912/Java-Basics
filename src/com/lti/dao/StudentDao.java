package com.lti.dao;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Course;
import com.lti.model.Student;

public interface StudentDao {
	
	boolean addAStudent(Student student);
	void updateAStudent(Student student,int id);
	void removeAStudent(int id);
	Student findStudent(int id);
	List<Student> viewAllStudent();
	void enroll (int studentId,int courseId);
	Course findCourse(int id);
	Set<Entry<Student,Course>> viewEnrollments();

}
