package Constructor;

public class AreaOfRectangle {
	int l;
	int b;
	AreaOfRectangle(){
		
	}
	   AreaOfRectangle(int l, int b){
		  this.l=l;
		   this.b=b;
	   }
	   double Area() {
		   return l*b;
		   
		   
	   }
	   public static void main(String[] args) {
		    AreaOfRectangle sc = new AreaOfRectangle(4,5);
		    AreaOfRectangle sc2 = new AreaOfRectangle(5,8);
		      System.out.println("The area of rectangle "+sc.Area());
		      System.out.println("The area of Rectangle "+sc2.Area());
		    
	}
	      

}
