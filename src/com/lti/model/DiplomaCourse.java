package com.lti.model;

public class DiplomaCourse extends Course {
	
	Type type;

	public DiplomaCourse() {
		// TODO Auto-generated constructor stub
		super();
	}

	public DiplomaCourse(int id, String name, int duration, double fees ,Type type) {
		super(id, name, duration, fees);
		this.type =type;
		// TODO Auto-generated constructor stub
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public void calculateMonthlyFee() {

		System.out.println(super.getId() + " "+ super.getName()+ " "+ super.getDuration());
		super.calculateMonthlyFee(); // reused based class
		
		if (type.name().equals("Proffesional"))
		{
			System.out.println("Total Fees: "+ (super.getFees())*1.1);
		}
		else {
			System.out.println("Total Fees: "+ (super.getFees())*1.05);
		}
	}
	

}
