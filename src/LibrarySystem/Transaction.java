package LibrarySystem;

// Transaction class represents a library transaction, whether a book is borrowed or returned
public class Transaction {
    // Properties of a transaction
    int userId;          // User ID associated with the transaction
    String bookTitle;    // Title of the book involved in the transaction
    boolean isBorrowed;  // Flag indicating whether the book is borrowed (true) or returned (false)

    // Constructor to initialize a transaction
    public Transaction(int userId, String bookTitle, boolean isBorrowed) {
        this.userId = userId;
        this.bookTitle = bookTitle;
        this.isBorrowed = isBorrowed;
    }
}
