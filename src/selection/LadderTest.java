package selection;

public class LadderTest {
	/*
	 * ============= else if ====================
	 * 
	 *   syntax :
	 *      
	 *       if(){
	 *       }
	 *       else if()	 
	 *       {
	 *          }
	 *          else if(){
	 *              }
	 *              else if(){
	 *              }
	 *              .........
	 *              
	 *        else{
	 *        }
	 *        
	 * 
	 */
	public static void main(String[] args) {
		
		
		 int marks = 17;
		     if(marks>= 80) {
		System.out.println("Distinction!!");
		
	}
		     else if(marks >= 60) {
		    	 System.out.println("First");}
		     else if(marks >= 45) {
		    	 System.out.println("Second");}
		     else if(marks >= 32) {
		    	 System.out.println("Third");
		     }
		     else {
		    	 System.out.println("Failed");
		     }
		   }
		     
	

}
