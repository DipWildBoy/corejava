package Encapsulation;

public class TestProduct {
	public static void main(String[] args) {
		Product p = new Product();
//		p.id= 5555;
//		p.name="Mobile";
//		p.Price=90000;
//		p.company="Samsung";
		
		p.setId(888888);
		p.setName("Mobile");
		p.setCompany("Samsung");
		p.setPrice(7000);
		
		System.out.println(p);
		
//		System.out.println("Id = "+p.getId());
//		System.out.println("Name = "+p.getName());
//		System.out.println("Price = "+p.getPrice());
//		System.out.println("Company = "+p.getCompany());
		
	}

}
