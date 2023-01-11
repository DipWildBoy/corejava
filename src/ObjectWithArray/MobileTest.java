package ObjectWithArray;

import java.util.Arrays;
import java.util.Scanner;

public class MobileTest {
	public static void main(String[] args) {
		Mobile [] mobile = new Mobile[3];
		Scanner em=new Scanner (System.in);
		
		for(int i=0; i<mobile.length; i++) {
		  Mobile m1= new Mobile();
		  System.out.println("Mobile Id: ");
		  m1.setId(em.nextInt());
		  System.out.println("Mobile Name");
		  m1.setName(em.next());
		  System.out.println("Name of Company");
		  m1.setCompany(em.next());
		  System.out.println("Price of mobile");
		  m1.setPrice(em.nextInt());
		  
		  mobile[i]=m1;
	
		}
     System.out.println(Arrays.toString(mobile));
	}
}
