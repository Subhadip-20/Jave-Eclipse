package LibrarySystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryManagementSystem {
    public static void main(String[] args) throws IOException {
        Library library = new Library();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Adding sample books to categories
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        library.addBook("To Kill a Mockingbird", "Harper Lee", "Classic");
        library.addBook("1984", "George Orwell", "Science Fiction");
        library.addBook("Dune", "Frank Herbert", "Science Fiction");
        library.addBook("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        library.addBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");

        while (true) {
            // Displaying the menu
            System.out.println("\nLibrary Management System");
            System.out.println("1. Register User");
            System.out.println("2. Add Book");
            System.out.println("3. Display Books By Category");
            System.out.println("4. Display All Books");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Display User Transactions");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(reader.readLine());

            // Switch statement to handle user input
            switch (choice) {
                case 1:
                    // Registering a new user
                    System.out.print("Enter user name: ");
                    String userName = reader.readLine();
                    int libraryId = library.registerUser(userName);
                    System.out.println("User registered successfully. Your Library ID is: " + libraryId);
                    break;
                case 2:
                    // Adding a new book to the library
                    System.out.print("Enter book title: ");
                    String title = reader.readLine();
                    System.out.print("Enter author: ");
                    String author = reader.readLine();
                    System.out.print("Enter category: ");
                    String category = reader.readLine();
                    library.addBook(title, author, category);
                    break;
                case 3:
                    // Displaying books by category
                    System.out.print("Enter category to display books: ");
                    String displayCategory = reader.readLine();
                    library.displayBooksByCategory(displayCategory);
                    break;
                case 4:
                    // Displaying all books in the library
                    library.displayBooks();
                    break;
                case 5:
                    // Borrowing a book
                    System.out.print("Enter your Library ID: ");
                    int borrowerId = Integer.parseInt(reader.readLine());
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = reader.readLine();
                    library.borrowBook(borrowerId, borrowTitle);
                    break;
                case 6:
                    // Returning a borrowed book
                    System.out.print("Enter your Library ID: ");
                    int returnerId = Integer.parseInt(reader.readLine());
                    System.out.print("Enter book title to return: ");
                    String returnTitle = reader.readLine();
                    library.returnBook(returnerId, returnTitle);
                    break;
                case 7:
                    // Displaying user transactions
                    System.out.print("Enter your Library ID: ");
                    int userId = Integer.parseInt(reader.readLine());
                    library.displayUserTransactions(userId);
                    break;
                case 8:
                    // Exiting the system
                    System.out.println("Exiting Library Management System. Goodbye!");
                    System.exit(0);
                default:
                    // Handling invalid choices
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }
}
