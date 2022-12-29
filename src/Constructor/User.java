package Constructor;

public class User {
	//instance variable
	   String Username;
	   String Password;
	   //=========default constructor=========
//	   User(){
//		   Username="root";
//		   Password="123";
//	   }
	   //=============Parameterized Constructor=========
	   User(String Username, String Password){
		   this.Username = Username;
		   this.Password = Password;
		   //this keyword represent current object.
	   }
	   void print () {
		   System.out.println("Username= "+Username);
		   System.out.println("Password= "+Password);
	   }
	   public static void main(String[] args) {
		  User u = new User("Jyoti","16238");
		     
		  User u1 = new User("Jyoti","163338");
		  u1.print();
		  u.print();
		  
	}

}
