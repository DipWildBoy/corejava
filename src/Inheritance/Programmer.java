package Inheritance;

public class Programmer extends Employee{
	
	String progLang;
	String project;
	int bonus;
	
	void print() {
		super.print();
		System.out.println("Programming Language"+progLang);
		System.out.println("Project "+project);
		System.out.println("Bonus"+bonus);
	}
  public static void main(String[] args) {
	  Programmer pg =new Programmer();
	  pg.id=999999999;
	  pg.name="Jyoti Sardar";
	  pg.salary=70000;
	  pg.bonus=4000;
	  pg.progLang="Java";
	  pg.age=33;
	  pg.project="EMS";
	  
	  pg.print();
	  
}
}
