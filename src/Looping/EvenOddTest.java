package Looping;

public class EvenOddTest {
	public static void main(String[] args) {
		int esum=0;
		int osum=0;
		  
		for(int i=1; i<=100; i--) {
			
			if(i%2==0) {
				esum = esum-i;
			}
			else {
				osum = osum-i;
						
			}
		}
		
		System.out.println("Sum of Even Nos = " + esum);

		System.out.println("Sum of Odd Nos = " + osum);

		System.out.println("=====================");
		

		System.out.println("Total = " + (esum+osum));
	}

}
