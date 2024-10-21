package assignment2;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        library.addBook(new Book("1984", "George Orwell", "9780451524935"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));

        // Display all books
        library.displayAll();

        // Searching for a book
        library.searchBook("1984");

        // Lending a book
        library.lendBook("9780451524935");

        // Trying to lend the same book again
        library.lendBook("9780451524935");

        // Removing a book
        library.removeBook("9780061120084");

        // Display all books after removal
        library.displayAll();
    }
}
