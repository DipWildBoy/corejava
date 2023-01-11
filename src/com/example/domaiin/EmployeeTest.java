package com.example.domaiin;

import Encapsulation.Employee;

public class EmployeeTest extends Employee {

	EmployeeTest(int empId, String name, String ssn, double salary) {
		super(empId, name, ssn, salary);
		// TODO Auto-generated constructor stub
	}
	public void printEmployee() {
		  super.printEmployee();
	}
	public static void main(String[] args) {
		EmployeeTest em = new EmployeeTest(101,"Jane Smith","012-34-5678",120345);
		em.printEmployee();
	}
     
}
