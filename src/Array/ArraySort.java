package Array;

import java.util.Arrays;

public class ArraySort {
  public static void main(String[] args) {
	   int data[]= {23,23,23,45,45,34,5,55,45,345,23234,234,22};
	   Arrays.sort(data);
	   System.out.println(Arrays.toString(data));
	   
	   System.out.println("========reverse order=====");
	   for (int i=data.length-1; i>=0; i--){
		   System.out.print(data[i]+",");
	   }
	   Arrays.fill(data, 50);
        Arrays.fill(data, 5,8,777);
        Arrays.fill(data, 8,12,444);
	   System.out.println("\n"+Arrays.toString(data)); 
	   int[] newArray = Arrays.copyOf(data, 5);
	   System.out.println(Arrays.toString(newArray));
	   System.out.println(Arrays.toString(Arrays.copyOfRange(data, 3, 9)));
   
	   
}}
   

