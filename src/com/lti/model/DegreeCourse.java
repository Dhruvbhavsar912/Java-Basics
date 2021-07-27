package com.lti.model;

public class DegreeCourse extends Course {
	
	private DegreeLevel degreeLevel;
	private boolean isPlacementAvailable;
	public DegreeCourse() {
		super(); // calls the default constructor for the parent class 
	}
	public DegreeCourse(int id, String name, int duration, double fees,DegreeLevel degreeLevel,boolean isPlacementAvailable) {
		super(id, name, duration, fees); // calls the parameterized constructor for the parent class 
		// TODO Auto-generated constructor stub
		this.degreeLevel = degreeLevel;
		this.isPlacementAvailable =isPlacementAvailable;
	}
	public DegreeLevel getDegreeLevel() {
		return degreeLevel;
	}
	public void setDegreeLevel(DegreeLevel degreeLevel) {
		this.degreeLevel = degreeLevel;
	}
	public boolean isPlacementAvailable() {
		return isPlacementAvailable;
	}
	public void setPlacementAvailable(boolean isPlacementAvailable) {
		this.isPlacementAvailable = isPlacementAvailable;
	}
	
	
	public void calculateMonthlyFee() {
		
		System.out.println(super.getId() + " "+ super.getName()+ " "+ super.getDuration());
		super.calculateMonthlyFee(); // reused based class
		
		if (isPlacementAvailable)
		{
		System.out.println("Total Fees:"+ (super.getFees())*1.1);
		System.out.println("In addittion to monthly fee,you need to pay "+ ((super.getFees())*.1) +" as a placement fee");
		}
		else {
			System.out.println("Total Fees:"+ (super.getFees()));
		}
	}
	

}
