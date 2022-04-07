package com.training;

import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VechicleInsurance;

public class Application {

	
	public static void printPremium(Insurance object) {
		
		System.out.println("Premium:="+object.calculatePremium());
	}
	
	
	
	public static void main(String[] args) {

		VechicleInsurance car = new VechicleInsurance(1010,"ramesh", "car",2019 );
		
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance();
		
		printPremium(life);
		
		String[] illness = {"ent","thyroid"};
		
		HealthInsurance health = new HealthInsurance(3030, "Vikcy",illness );
		
		printPremium(health);
		
		
	}

}
