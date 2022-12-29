package OOPS;

public class Book {
     //properties 
	int id;
	String name;
	int price;
	String author;
	 
	//method 
	void printBookInfo() {
		System.out.println("ID ="+id);
		System.out.println("Name ="+name);
		System.out.println("Price ="+price);
		System.out.println("Author ="+author);
	}
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.id=5555;
		b1.price=9000;
	    b1.name="Math";
	    b1.author="R.K Sharma";
	    
	    b1.printBookInfo();
	    
	   Book b2 = new Book();
	    b2.id=555;
		b2.price=9000;
	    b2.name="English";
	    b2.author="D.K Ram";
	    
	    b2.printBookInfo();
	    
	 
	    
	      
	    
	    
	}
	
}
