package selection;

public class NestedIfTest {
	/*
	 * syntax
	 *    if (Condition-1){
	 *         if(condition-2){
	 *         ...................
	 *         } 
	 *         else{
	 *         
	 *         
	 *         }
	 *      }else{
	 *      
	 *              }
	 *              }
	 *         
	 *         
	 *         
	 */
	
	
	public static void main(String[] args) {
		
		
		    String citizen = "Nepali";
		    int  age = 18;
		    boolean voterId = true;
		    
		    
		    if(citizen.equals("Nepali")) {
		    	if(age>= 18){
		    	 
		    	   if(voterId) {
		    		   System.out.println(" Validate voter");
		    		   
		    		    
		    		   
		    	   }else {
		    		   System.out.println("You dont have voter Id");
		    	   }
		    	 
		    	}  else{
		    		System.out.println("You are underage");
		    		
		    	}
		    	
		    }else {
		    	System.out.println("Invalid citizenship!!");
		    	
		    }
		
	}

}
