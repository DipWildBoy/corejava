package com.example.domaiin;

import Encapsulation.Manager;

public class Director extends Manager{
//	private double budget;
	int Id = 12;
	String name = "Susan Wheeler";
	String ssn ="099-45-2340";
	double salary= 120567.36;
	String deptname= "Global Marketing";
	private double budget =1000000.00;	
	
	protected void printEmployee() {
		System.out.println("Id = "+Id);
		System.out.println("Name = "+name);
		System.out.println("SSN"+ssn);
		System.out.println("Salary = "+salary);
		System.out.println("Department"+deptname);
		System.out.println("Budget"+budget);
		
	}
	

	public Director(int empId, String name, String ssn, double salary, String deptName,double budget) {
		super(empId, name, ssn, salary, deptName);
		this.budget=budget;
	}

	public double getBudget() {
		return budget;
	}

}
