package pkgg;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<String> books = new ArrayList<>();
	private List<String> borrowedBooks = new ArrayList<>();

	public void addBook(String bookName) {
		books.add(bookName);
		System.out.println(bookName + " added to library.");
	}

	public void removeBook(String bookName) {
		if (books.isEmpty()) {
			System.out.println("No books available in the library to remove.");
		} else if (books.remove(bookName)) {
		if (books.remove(bookName)) {
			System.out.println(bookName + " removed from library.");
		} else {
			System.out.println(bookName + " not found in library.");
		}
	}

	public void borrowBook(String bookName) {
		if (books.contains(bookName)) {
			books.remove(bookName);
			borrowedBooks.add(bookName);
			System.out.println(bookName + " has been borrowed.");
		} else {
			System.out.println(bookName + " is either not available or already borrowed.");
		}
	}

	public void returnBook(String bookName) {
		if (borrowedBooks.contains(bookName)) {
			borrowedBooks.remove(bookName);
			books.add(bookName);
			System.out.println(bookName + " has been returned.");
		} else {
			System.out.println(bookName + " was not borrowed from this library.");
		}
	}

	public void listBooks() {
		System.out.println("Available books: " + books);
		System.out.println("Borrowed books: " + borrowedBooks);
	}

	public boolean searchBook(String bookName) {
		return books.contains(bookName);
	}

	public static class Main {
		public static void main(String[] args) {
			Library myLibrary = new Library();
			myLibrary.addBook("Harry Potter");
			myLibrary.addBook("Lord of the Rings");

			myLibrary.borrowBook("Harry Potter");
			myLibrary.borrowBook("The Hobbit");
			myLibrary.listBooks();

			myLibrary.returnBook("Harry Potter");
			myLibrary.returnBook("The Hobbit");
			myLibrary.listBooks();
		}
	}
}