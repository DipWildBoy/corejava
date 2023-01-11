package ObjectWithMehtod;

public class Test {
   public static void main(String[] args) {
	   
//	Student std = new Student ();
//	   std.setId(3333);
//	   std.setFname("Rahul");
//	   std.setLname("Gandhi");
//	   std.setCollege("NCIT");
//	   std.setAge(56);
         Test t = new Test();
	   Student x = t.getStudentData();
	     t.print(x);
	 
	 

   }
//=========object as argument=========
   void print(Student st) {
	   System.out.println("Id = "+st.getId());
	   System.out.println("Firstname = "+st.getFname());
	   System.out.println("Lastname = "+st.getLname());
	   System.out.println("College = "+st.getCollege());
	   System.out.println("Age = "+st.getAge());
   }
   //=========object as return type==========
   Student getStudentData() {
	   Student std = new Student ();
	   std.setId(3333);
	   std.setFname("Rahul");
	   std.setLname("Gandhi");
	   std.setCollege("NCIT");
	   std.setAge(56);
	   
	   return std;
	   
   }

}
