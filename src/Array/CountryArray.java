package Array;

import java.util.Scanner;

public class CountryArray {
	public static void main(String[] args) {
		
		String Country[] = new String[48];
	 Scanner sc = new Scanner(System.in);
		   for (int i=0; i<Country.length; i++) {
			   System.out.println("Enter your Country");
			   Country[i]= sc.next();
			   
			   
		   }
		   //read data from array
		   for (String x : Country) {
			   
		   
		    System.out.println(x);
		    }
	}
	
				   
			   
		   }
	   



