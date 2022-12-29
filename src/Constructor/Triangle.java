package Constructor;

public class Triangle {
	int side1;
	int side2;
	int side3;
	
	
  public double area() {
	  double s = (side1 + side2 + side3) / 2;
      double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
      return area;
	   
   }
  public int perimeter() {
	 return side1+side2+side3;
	  
  }
   void print() {
	        System.out.println("Side 1"+side1);
	        System.out.println("side 2"+side2);
	        System.out.println("side 3"+side3);
	   
   }
			public static void main(String[] args) {
				Question_4 triangle = new Question_4();
				  System.out.println("Area of the triangle: " + triangle.area());
			      System.out.println("Perimeter of the triangle: " + triangle.perimeter());
			}

}
