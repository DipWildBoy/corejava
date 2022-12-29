package OOPS;

import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;
    
    
    void AreaofRectangle() {
    	int a = length*breadth;
    	System.out.println("The Area of Rectangle ="+a);}
    void PerimeterofRectangle() {
    	int p = 2*(length+breadth);
    			
    	System.out.println("The Perimeter of Rectangle ="+p);
    }
    	
    	
    
    public static void main(String[] args) {
		Rectangle area = new Rectangle();
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter The length");
		  
		  area.length=sc.nextInt();
		  System.out.println("Enter The breadth");
		   area.breadth=sc.nextInt();
		   
		   
		   
		   area.AreaofRectangle();
		
		Rectangle Perimeter = new Rectangle();
		System.out.println("Enter length for p");
		Perimeter.length=sc.nextInt();
		System.out.println("Enter breadth for p");
		Perimeter.breadth=sc.nextInt();
		
		Perimeter.PerimeterofRectangle();
	}
}
