package corejava;

import java.util.Scanner;

public class Farenheitcalculator {
	public static void main(String[] args) {
		double Fahrenheit;
		  
		double celsius ;
		    Scanner sc = new Scanner(System.in);
		       System.out.println("Enter temprature in Fahrenheit");
		           Fahrenheit = sc.nextDouble();
		          
		           celsius=((Fahrenheit-32)*5)/9; 
		    		
		  System.out.println("Temprature in celsius is =" +celsius);
		      
		       System.out.println("Enter temprature in Celsius");
		           celsius = sc.nextDouble();
		           
		           Fahrenheit =( (celsius*9)/5)+32;
		 
		           System.out.println("Temperature in Fahrenheit="+Fahrenheit);
		  
		  
	}

}
