package Array;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithMethod {
 /*
  * =========Array With Method============
  * 
  * 1> array as argument:
  *     void sum(float a[]){
  *     }
  *   sum(array);
  * 2> array as return type:
  *    int[] getData(){
  *    
  *    //array = 100,90,50,44,32,3234,32,
  *    return array;
  *    }
  */
	  public static void main(String[] args) {
//		 int data[]= {23,234,4242,423,42,424,2442423,44234,4} ;
//		 sum(data);
		 int [] x = getOddsnumsFrom1to50();
		 System.out.println(Arrays.toString(x));
		
		 
	}
	  // 1. Array as arguments
	    static void sum (int values[]) {
	    	
	    	int s=0;
	    	
	    	for(int x : values) {
	    		s = s+x;
	    		
	    	}
	    	System.out.println("Total="+s);
	    }
         static void Printarray(int array[]) {
        	
  		   for(int a : array) {
  			   System.out.println(a);
  		   }
        	 
         }
       //2. Array with return type
  	    static int[] getOddsnumsFrom1to50() {
  		   int oddnums[]= new int[25];
  		   int j=0;
  		   
  		   for (int i=1; i<50; i++) {
  			   if(i%2 != 0) {
  				   oddnums[j]=i;
  				   j++;
  			   }
}
  		   return oddnums;
  	    }}
