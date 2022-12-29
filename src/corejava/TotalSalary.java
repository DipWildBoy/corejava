package corejava;

import java.util.Scanner;

public class TotalSalary {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     System.out.println("Press 1: MD\nPress 2: CEO\nPress 3: Manager\nPress 4: Helper");
	     System.out.println("Enter your choice: ");
	        int post = sc.nextInt();

//	        Calculation
	        double md = 40000*0.2989+40000;
	        double ceo = 53800*0.15+53800;
	        double manager = 28000*0.0578+28000;
	        double helper = 32000*0.0798+32000;

	        switch (post){
	            case 1:
	                System.out.println("Basic salary: 40000");
	                System.out.println("Bonus: 29.89%");
	                System.out.println("Total: "+ md);
	                break;
	            case 2:
	                System.out.println("Basic salary: 53800");
	                System.out.println("Bonus: 15%");
	                System.out.println("Total: "+ ceo);
	                break;
	            case 3:
	                System.out.println("Basic salary: 28000");
	                System.out.println("Bonus: 5.78%");
	                System.out.println("Total: "+ manager);
	                break;
	            case 4:
	                System.out.println("Basic salary: 32000");
	                System.out.println("Bonus: 7.98%");
	                System.out.println("Total: "+ helper);
	                break;
	            default:
	                System.out.println("Please enter valid Post.");
	        }
	    }
	
		
		
	}
	
		  