package Array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		   int age[] = new int[5];
		   // write data in array
//		   age[0] = 20;
//		   age[1] = 22;
//		   age[2] = 18;
//		   age[3] = 17;
//		   age[4] = 20;
		 Scanner sc = new Scanner(System.in);
		   for (int i=0; i<age.length; i++) {
			   System.out.println("Enter your age");
			   age[i]= sc.nextInt();
			   
			   
		   }
		   //read data from array
		   for (int x : age) {
			   
		   
		    System.out.println(x);
		    }
	}
	
				   
			   
		   }
	   


