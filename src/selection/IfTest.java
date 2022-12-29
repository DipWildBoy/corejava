package selection;

import java.util.Scanner;

public class IfTest {
	/*
	 * syntax:
	 *    
	 *    
	 *     if(condition){
	 *         
	 *         //statements
	 *                    
	 *                    }
	 *              
	 *            
	 * 
	 */
	public static void main(String[] args) {
		 int l;
		 int b;
		 int Area=0;
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Enter your length");
		 
		 l= sc.nextInt();
		  
		 
		 System.out.println("Enter your breadth");
		 
		 b= sc.nextInt();
	if(l!=0 && b>0) {
		 
		 Area= l*b;
		  System.out.println("Your Total Area = " +Area);
	}
	}

}
