package Array;

public class Addition {
  public static void main(String[] args) {
	  int mat1[][]= {{40,90},{22,11}};
	  int mat2[][]= {{5,7},{9,2}};
	  
	  int mat3[][]= new int [2][2];
	  
	  //Addition
	  for (int i=0; i<2; i++) {
		    for (int j=0; j<2; j++) {
		    	mat3[i][j]=mat1[i][j]+mat2[i][j];
		    	System.out.print(mat3[i][j]+ " ");
		    	
		    }
		    System.out.println();
	  }
}
}
