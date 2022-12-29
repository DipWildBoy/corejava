package OOPS;

import java.util.Scanner;

public class Area {
	   int l;
	   int b;
	   
	   void setDim() {
		   
	   
		   Scanner sc = new Scanner(System.in);
		     System.out.println("Enter Length");
		     l=sc.nextInt();
		     System.out.println("Enter Breadth");
		     b=sc.nextInt();}
	   
		   
	int getArea() {
	
		   int area=l*b;
		   System.out.println("The area is"+area);
		   return area;
		  
	   }
	   public static void main(String[] args) {
		   Area a= new Area();
	a.setDim();
	System.out.println("The area is "+a.getArea());
		    
		     
		
	   }
	}



