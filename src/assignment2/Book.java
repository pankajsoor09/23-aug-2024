package assignment2;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable;

	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isAvailable = true; // Book is available when created
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: "
				+ (isAvailable ? "Yes" : "No");
	}
}

// Library class that manages the collection of books
class Library {
	private List<Book> books;

	// Constructor to initialize the list of books
	public Library() {
		books = new ArrayList<>();
	}

	// Method to add a book to the library
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added: " + book.getTitle());
	}

	// Method to remove a book from the library using ISBN
	public void removeBook(String ISBN) {
		Book bookToRemove = null;
		for (Book book : books) {
			if (book.getISBN().equals(ISBN)) {
				bookToRemove = book;
				break;
			}
		}
		if (bookToRemove != null) {
			books.remove(bookToRemove);
			System.out.println("Book removed: " + bookToRemove.getTitle());
		} else {
			System.out.println("Book not found with ISBN: " + ISBN);
		}
	}

	// Method to search for a book by title
	public void searchBook(String title) {
		boolean found = false;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				System.out.println("Book found: " + book);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Book not found with title: " + title);
		}
	}

	// Method to lend a book by ISBN
	public void lendBook(String ISBN) {
		for (Book book : books) {
			if (book.getISBN().equals(ISBN)) {
				if (book.isAvailable()) {
					book.setAvailable(false);
					System.out.println("Book lent: " + book.getTitle());
				} else {
					System.out.println("Book is already lent out: " + book.getTitle());
				}
				return;
			}
		}
		System.out.println("Book not found with ISBN: " + ISBN);
	}

	// Method to display all books in the library
	public void displayAll() {
		if (books.isEmpty()) {
			System.out.println("No books in the library.");
		} else {
			System.out.println("Library Collection:");
			for (Book book : books) {
				System.out.println(book);
			}
		}
	}
}
