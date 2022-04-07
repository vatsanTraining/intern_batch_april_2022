package com.training;

import com.training.model.Student;
import com.training.services.ExcepionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {

		Student ram = new Student(1010,"Ramesh", 98);
		
		StudentService service = new StudentService(ram);
		
		System.out.println(service.sendDetails());
		
		
		StudentService service2 = new StudentService();
		
		try {
			System.out.println(service2.findRank());
		} catch (Exception e) {

			
			System.err.println("Name is not passed");
		}
		
		
		ExcepionHandling exHandling = new ExcepionHandling();
		
		exHandling.usingArrayIndexException(args);
		
		
		
	}

}
