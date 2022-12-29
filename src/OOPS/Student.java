package OOPS;

import java.util.Scanner;

public class Student {
	String name;
	int roll_no;
	
	void PrintStudent() {
		System.out.println("The name of student ="+name);
		System.out.println("Roll_no ="+roll_no);
		System.out.println("Phone ");
		
	}
	public static void main(String[] args) {
		Student detail = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the student=");
		   detail.name=sc.next();
		System.out.println("Roll number is=");
		   detail.roll_no=sc.nextInt();
		   
		   detail.PrintStudent();
		   
	}

}
