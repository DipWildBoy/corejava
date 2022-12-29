package OOPS;

import java.util.Scanner;

public class Cars {
	int id;
	String model;
	String name;
	String price;
	
	void printcarInfo(){
       System.out.println("The id of car ="+id);
       System.out.println("The model no is"+model);
       System.out.println("Car name"+name);
	   System.out.println("price of the car"+price);
	   
	}
	public static void main(String[] args) {
		   Cars c1 = new Cars();
		   Scanner CAR = new Scanner(System.in);
		   System.out.println("Enter car ID");
		   c1.id=CAR.nextInt();
		   System.out.println("Enter car model");
		   c1.model=CAR.next();
		   System.out.println("Enter car name");
		   
		   c1.name=CAR.next();
		   System.out.println("Enter price");
		   c1.price=CAR.next();
		   
		   c1.printcarInfo();
		   
		   
	}
	
	

}
