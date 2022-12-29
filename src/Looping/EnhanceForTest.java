package Looping;

public class EnhanceForTest {
    /*
     * =========Enhancefortest=========
     *   syntax:
     *      for (data_type var : collection){
     *      
     *      //statements
     *      }
     * 
     */
    public static void main(String[] args) {
		int data[] = {32,32,43,5,34,5,34,5,34,4,53,2,3,23,34,2};
			int sum=0;
			
               for(int x:data) {
    	 
    	    System.out.println(x);
    	         sum= sum+x;
    	    System.out.println("The sum of x is"+sum);
     }
    }
    
}


