//Program written by Muhammad Saif Khan
//Below is the code for the program


package javatraining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Book{
	String id;
	String title;
	String Authorname;
	String category;
	float price;
	
	// parameterized constructor 
	public Book(String id, String title, String Authorname, String category, float price) {
		super();
		this.id = id;
		this.title = title;
		this.Authorname = Authorname;
		this.category = category;
		this.price = price;
	}
	void show()
	{
		System.out.println(id +" " +Authorname +" " +category +" " + price);
	}
	
	
	
}
public class BookStore {
	public static void main(String[] args) {
		Book b = new Book("OAL", "Ocean At The End of The Lane","Fiction",799f );
		Book b1 = new Book("FIOS","Fault In Our Stars","John Green","Fiction,855f );
		Book b2 = new Book("PJ","Percy Jackson","Rick Rordan","Fiction",455f );
		b.show();
		b1.show();
		b2.show();
		
		
	// 	add() method 
		List<Book>booklist= new ArrayList<Book>();
		booklist.add(b);
		booklist.add(b1);
		booklist.add(b2);
		
	//	method to search book by author name
		List<String>search =booklist.stream().map(p1 -> p1.Authorname).collect(Collectors.toList());
  		System.out.println("author name are :- "+search);
}
}