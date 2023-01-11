package Encapsulation;

public class Manager extends Employee {
	int Id= 207;
	String name ="Barbara Johnson";
	String ssn ="054-12-2367";
	double salary =109_501.36;
	String deptname= "US Marketing";
	protected void printEmployee() {
		System.out.println("Id = "+Id);
		System.out.println("Name = "+name);
		System.out.println("SSN"+ssn);
		System.out.println("Salary = "+salary);
		System.out.println("Department"+deptname);
		
	}
	
	private String deptName;
	
 public	Manager(int empId, String name, String ssn, double salary,String deptName) {
		super(empId, name, ssn, salary);
		 this.deptName = deptName;
	}

public String getDeptName() {
	return deptName;
}

	  

}
