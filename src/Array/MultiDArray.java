package Array;

import java.util.Scanner;

public class MultiDArray {

	/* 
	 * ==========MultiDarray=========
	 *    syntax:
	 *    
	 *     data_type array_name[][]= new data_type[row][col]
	 *     
	 */
public static void main(String[] args) {
	int mat[][]=new int [2][2];
	
	/*
	 *       c0    c1
	 *  R0  [40]  [90]
	 *  R1  [77]  [55]
	 */ 
	     
	//write data multiDarray
//	
//	mat[0][0]=40;
//	mat[0][1]=90;
//	mat[1][0]=77;
//	mat[1][1]=55;
	Scanner sc=new Scanner(System.in);

for (int i=0; i<2; i++) {
	    for (int j=0; j<2; j++) {
	  System.out.println("Enter value ");
	  
	    	mat[i][j]=sc.nextInt();
	    	
	    }
}
     //read data from multiDarray
for (int i=0; i<2; i++) {
    for (int j=0; j<2; j++) {
    System.out.print(mat[i][j]+" ");
    }
    System.out.println();
    }


}}

