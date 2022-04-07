package com.training.model;

public class LifeInsurance extends Insurance{

	private int age;

	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LifeInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}

	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		this.age = age;
	}

	@Override
	public double calculatePremium() {

		double premium = 5000;
		
		if(age<50) {
			premium = 6000;
		}
		return premium;
	}
	
	
		
}
