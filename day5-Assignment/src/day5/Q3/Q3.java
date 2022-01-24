package day5.Q3;

/*
Create your own BookCollection and check if you own a particular book:"Java in depth". Sort the 
BookCollection
and output the BookCollection.
 */
import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		Book b1 = new Book("Java The Complete Reference", "Herbert Schildt");

		Book b2 = new Book("Core Java An Integrated Approach ", "Dr. R. Nageswara Rao");

		Book b3 = new Book("Java in depth", "Akshat ");
		books.add(b1);
		books.add(b2);
		books.add(b3);

		BookCollection collection = new BookCollection("Akshat", books);

		if (collection.hasBook(b3) == true) {
			System.out.println(b3.toString() + "is found");
		} else {
			System.out.println(b3.toString() + "was not found");
		}

		collection.sort();
		System.out.println("Collection of all Books:");
		for (Book e : books) {
			System.out.println(e);
		}
	}
}