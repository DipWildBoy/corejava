package OOPS;

public class EmployeeWork {
	
	    String name, address;
	    int yoj;
	    double salary;

	    public EmployeeWork(String name, int yoj,double salary, String address){
	        this.name = name;
	        this.yoj = yoj;
	        this.salary = salary;
	        this.address = address;
	    }

	    public void printDetails(){
	        System.out.println(this.name +"\t"+this.yoj+ "\t"+this.address);
	    }

	    public static void main(String[] args) {
	        EmployeeWork e1 = new EmployeeWork("Robert", 1994,4000, "64C- WallsStreat");
	        EmployeeWork e2 = new EmployeeWork("Samu", 2000,5000, "68C- WallsStreat");
	        EmployeeWork e3 = new EmployeeWork("John", 1999,45000, "26B- WallsStreat");

	        System.out.println("Name  Year of joining \t Address");
	        e1.printDetails();
	        e2.printDetails();
	        e3.printDetails();
	    }
	}

