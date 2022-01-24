package day5.Q3;

import java.util.*;

public class BookCollection {
	private String ownerName;
	private ArrayList<Book> books;

	public BookCollection(String ownerName, ArrayList<Book> books) {
		this.ownerName = ownerName;
		this.books = books;
	}

	public boolean hasBook(Book b) {
		boolean isPresent = false;
		for (Book e : books) {
			if ((b.getBookTitle()).equals(e.getBookTitle()) && (b.getBookAuthor()).equals(e.getBookAuthor())) {
				isPresent = true;
				break;
			}
		}

		return isPresent;
	}

	@Override
	public String toString() {
		return "BookCollection [Name of Owner=" + ownerName + ", Books=" + books + "]";
	}

	public void sort() {
		Collections.sort(books, new BookSortAsPerTitle_Author());

	}

}