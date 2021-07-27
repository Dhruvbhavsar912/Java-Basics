package com.lti.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {

	// member variables : instance variable and class variable
	private int id;
	private String name;
	private LocalDate dateOfBirth; // camel casing
	private String[] phoneNumber;
	private static String collegeName; // static - not object variables class variables

	// Constructors
	// it does not return any value
	// it is used to store instance variable in heap memory
	// constructers are used initially

	// static block runs before main method
	static {
		collegeName = "LTI Technical Institute";
	}

	// default constructor
	public Student() {
		System.out.println("Default Constructor");
	}

	// pramaterized constructor
	public Student(int id, String name, LocalDate dateOfBirth, String[] phoneNumber) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}
	
	// pramaterized constructor
		public Student(int id, String name, LocalDate dateOfBirth) {
			this.id = id;
			this.name = name;
			this.dateOfBirth = dateOfBirth;
		}

	// Getters and Setters Method (accessor and mutator method)
	// setter method are public and access outside the class

	public int getId() {
		return id;
	}

	public String[] getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	

}
