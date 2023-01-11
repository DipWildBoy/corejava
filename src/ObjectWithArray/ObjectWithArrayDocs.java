package ObjectWithArray;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectWithArrayDocs {
	/*
	 * ===============Array of object==========
	 *  syntax:
	 *    class_name[]array_name = new class_name[size];
	 *    
	 */
public static void main(String[] args) {
	  	Book[] books = new Book[5];
	  	Scanner em = new Scanner(System.in);
	  	for (int i=0; i<books.length; i++) {
	  		
	  
	  	Book b1 = new Book();
	  	System.out.println("Id");
	  	b1.setId(em.nextInt());
	  	System.out.println("Name");
	  	b1.setName(em.next());
	  	System.out.println("Author");
	  	b1.setAuthor(em.next());
	  	System.out.println("Price");
	  	b1.setPrice(em.nextInt());
	  	System.out.println("Pages");
        b1.setPage(em.nextInt());
        books[i]=b1;
		System.out.println(Arrays.toString(books));
	  	
	  			
}
}}
