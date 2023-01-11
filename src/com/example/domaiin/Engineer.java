package com.example.domaiin;

import Encapsulation.Employee;

public class Engineer extends Employee {
	protected Engineer(int empId, String name, String ssn, double salary) {
		super(empId, name, ssn, salary);
		// TODO Auto-generated constructor stub
	}

	int Id=101;
	String name="Jane Smith ";
	String ssn="012-34-5678";
	int salary=120345; 
	
	protected void printEmployee() {
		Engineer E = new Engineer(101,"Jane Smith","012-34-5678",120345);
		System.out.println("Id = "+E.Id);
		System.out.println("Name = "+E.name);
		System.out.println("SSN"+E.ssn);
		System.out.println("Salary = "+E.salary);
		
	}


}
