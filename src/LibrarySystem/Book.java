package LibrarySystem;

// Book class represents a book in the library
public class Book {
    // Properties of a book
    String title;     // Title of the book
    String author;    // Author of the book
    String category;  // Category of the book
    boolean available;  // Flag indicating whether the book is available for borrowing

    // Constructor to initialize a book
    public Book(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.available = true;  // By default, a new book is available
    }
}
