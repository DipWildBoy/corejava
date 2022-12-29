package corejava;

import java.util.Scanner;

public class VoCylinder {
	  public static void main(String[] args) {
		  int r;
		  int h;
		  double pi = 3.14;
		   Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the radius");
		     r = sc.nextInt();
		     System.out.println("Enter the height");
		     h = sc.nextInt();
		     
		      double volume = pi*r*r*h;
		         System.out.println("Volume of Cylinder ="+ volume);
		     
	}

}
