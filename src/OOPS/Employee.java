package OOPS;

public class Employee {
	
	
		   String name;
		   int yearOfJoining;
		   String address;

		  public Employee(String name, int yearOfJoining, String address) {
		    this.name = name;
		    this.yearOfJoining = yearOfJoining;
		    this.address = address;
		  }

		 String getName() {
		    return name;
		  }

		  int getYearOfJoining() {
		    return yearOfJoining;
		  }


		 String getAddress() {
		    return address;
		  }
		
         public static void main(String[] args) {
		    Employee employee1 = new Employee("Robert", 1994,  "64C- WallsStreat");
		    Employee employee2 = new Employee("Sam", 2000,  "68D- WallsStreat");
		    Employee employee3 = new Employee("John", 1999, "26B- WallsStreat");

		      System.out.println("Name\t\tYear of joining\t\t Address");
		      System.out.println(employee1.getName() + "\t"+"\t" + employee1.getYearOfJoining() + "\t"+"\t"+"\t" + employee1.getAddress());
		      System.out.println(employee2.getName() + "\t"+"\t" + employee2.getYearOfJoining() + "\t"+"\t"+"\t"+ employee2.getAddress());
		      System.out.println(employee3.getName() + "\t"+"\t" + employee3.getYearOfJoining() + "\t"+"\t"+"\t" + employee3.getAddress());
		  }
		}


