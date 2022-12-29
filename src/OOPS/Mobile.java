package OOPS;

import java.util.Scanner;

public class Mobile {
	int id;
	String company;
	String Model;
	String Name;
	int price;
	    
	void PrintMobileInfo() {
		   System.out.println("Mobile Id"+id);
		   System.out.println("Company Name"+company);
		   System.out.println("Model name"+Model);
		   System.out.println("Mobile Name"+Name);
		   System.out.println("Price of device"+price);
		   
		   
	}
	public static void main(String[] args) {
		     Mobile m3 = new Mobile();
		     Scanner sc = new Scanner(System.in);
		     System.out.println("id");
		     
		         m3.id=sc.nextInt();
		     System.out.println("Company name");
		     
		     
		         m3.company=sc.next();
		     System.out.println("Model");
		         m3.Model=sc.next();
		         System.out.println("Name");
		         m3.Name=sc.next();
		         System.out.println("Price");
		         m3.price=sc.nextInt();
		       
		       m3.PrintMobileInfo();
		       
		     
	}

}
