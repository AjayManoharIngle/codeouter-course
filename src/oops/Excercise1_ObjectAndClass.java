package oops;

class Book{
	String bookName;
	String author;
	int noOfPages;
	String publisherName;
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", noOfPages=" + noOfPages + ", publisherName="
				+ publisherName + "]";
	}
}

public class Excercise1_ObjectAndClass {

	public static void main(String[] args) {
		
		// Create Book class which has state -> bookName, author, noOfPages, publisher
		
		Book book1 = new Book();
		book1.bookName="Ramayan";
		book1.author = "Ajay";
		book1.noOfPages=100;
		book1.publisherName="Vijay";
		System.out.println(book1);
		 
		Book book2 = new Book();
		book2.bookName = "MahaBharat";
		book2.author = "Snehal";
		book2.noOfPages=500;
		book2.publisherName="Vijay";
		System.out.println(book2);
	}
}
