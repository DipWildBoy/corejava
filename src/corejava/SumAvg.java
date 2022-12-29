package corejava;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		   int a;
		   int b; 
		   int sum;
		   float avg;
       Scanner Avg = new Scanner(System.in);
		
           
		
		System.out.println("Enter First Number: " );
		       a = Avg.nextInt();
		   
		    
		System.out.println("Enter Second Number: ");
		       b = Avg.nextInt();
		       
		    sum = a+b;
		    avg = (a+b)/2;
		    System.out.println("Sum :" +sum+"\n Average:" + avg);
		    
		   
	}

}
