import java.util.*;
class Book{
private double price;
private int quantity;
private String title, author;

Book(String title, String author, double price, int quantity) {
this.title=title;
this.author=author;
this.price=price;
this.quantity=quantity;
}
void display() {

System.out.println("Book Title : "+title);

System.out.println("Book Author : "+author);

System.out.println("Book Price : "+price);

System.out.println("Book Quantity : "+quantity);
}
}
class Bookdescription {
public static void main(String args[]) {
	Book b1 = new Book("Great Expectations","- Charles Dickens",255,4);
	Book b2 = new Book("War and Peace","- Leo Tolstoy",455,4);
	Book b3 = new Book("To the Lighthouse","- Virginia Woolf",355.23,4);
	
	b1.display();
	b2.display();
	b3.display();
}

}

