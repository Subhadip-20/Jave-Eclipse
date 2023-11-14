package LibrarySystem;

// User class represents a library user
public class User {
    // Properties of a user
    String name;        // User's name
    int libraryId;      // Unique identifier for the user in the library system

    // Constructor to initialize a user
    public User(String name, int libraryId) {
        this.name = name;
        this.libraryId = libraryId;
    }
}
