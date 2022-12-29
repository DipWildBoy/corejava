package OOPS;

import java.util.Scanner;

public class Student1 {
	int roll_no;
	Long phone;
	String address;
	
	void DetailStudent() {
		    System.out.println("The roll number = "+roll_no);
		   System.out.println("Phone Number = "+phone);
		    System.out.println("Student Address"+address);
		    
	}
	public static void main(String[] args) {
		    Student1 detail1 = new Student1();
		       Scanner sc = new Scanner(System.in);
		       System.out.println("Student Roll_no = ");
		           detail1.roll_no=sc.nextInt();
		       System.out.println("Student Phone Number = ");
		           detail1.phone=sc.nextLong();
		       System.out.println("Student address");
		           detail1.address=sc.next();
		           
		           detail1.DetailStudent();
		           
		           
		 
		           
		           
		           
	}

}
