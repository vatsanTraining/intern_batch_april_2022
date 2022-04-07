package com.example;

import com.example.model.Student;

public class Application{

	public static void main(String[] args) {

		Student ram = new Student();
		
		//ram.rollNumber=5050;
		
		// public method able to access
		ram.setRollNumber(56);
		// default method unable to access=> 
		// because student class is in com.example.model package 
		// and Application is in com.example package
	//	ram.setFirstName("Ram");
		// Unable to access because Application is NOT a subclass
		// of student
	//	ram.setMarkScored(89);
		// Unable to access because the method is Private in student Clas
		
		// ram.setBranch("BE");
		
		System.out.println("Roll Number :="+ram.getRollNumber());
		
		System.out.println("Mark Scored:="+ram.getMarkScored());

		System.out.println("Student Name:="+ram.getFirstName());
		
		Student shyam = new Student(490, "Shyam", 89, "Mech");
		
		System.out.println("Roll NUmber:="+shyam.getRollNumber());
		System.out.println("Student Name:="+shyam.getFirstName());
		
		Student magesh = new Student(988, "Subramani", "textile");
		System.out.println("Roll NUmber:="+magesh.getRollNumber());
		System.out.println("Student Name:="+magesh.getMarkScored());
		
				
	}

}
