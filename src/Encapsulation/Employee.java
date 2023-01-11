package Encapsulation;

public class Employee {
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	protected Employee(int empId , String name, String ssn, double salary){
		this.empId=empId;
		this.name=name;
		this.ssn=ssn;
		this.salary=salary;
		
	}

	public int getEmpId() {
		return empId;
	}

//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

//	public void setSsn(String ssn) {
//		this.ssn = ssn;
//	}

//	public double getSalary() {
//		return salary;
//	}

  double raisesalary(double increase) {
	    if (increase>0) {
	    	salary=increase+salary;
	    	
	    }
	    return salary;
	   
  }
	protected void printEmployee() {
   	 Employee E = new Employee(empId,name,ssn,salary );
   	  System.out.println("Id"+E.empId);
   	  System.out.println("Name"+E.name);
   	  System.out.println("Ssn"+E.ssn);
   	  System.out.println("Salary"+E.salary);
   	 
   	     
   	 
    }


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + "]";
	}
	
}
