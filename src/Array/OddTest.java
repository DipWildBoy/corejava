package Array;

import java.util.Scanner;

public class OddTest {
public static void main(String[] args) {
	
		  Scanner sc = new Scanner (System.in);

		  System.out.println("Enter the value of size");
		  int a = sc.nextInt();

		  int arr[] = new int[5];

		  for (int i = 0; i< arr.length; i++) {
		   arr[i] = sc.nextInt();
		  }
		  for (int i = 0; i< arr.length; i++) {
		   if (arr[i] % 2 == 0)
		    System.out.println("even");
		   else
		    System.out.println("odd");
		  }
		 

		
}
}