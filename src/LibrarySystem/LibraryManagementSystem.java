package LibrarySystem;

import java.util.Scanner;

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);

		// Adding sample books to categories
		library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
		library.addBook("To Kill a Mockingbird", "Harper Lee", "Classic");
		library.addBook("1984", "George Orwell", "Science Fiction");
		library.addBook("Dune", "Frank Herbert", "Science Fiction");
		library.addBook("The Hobbit", "J.R.R. Tolkien", "Fantasy");
		library.addBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");

		while (true) {
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
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline

			switch (choice) {
			case 1:
				System.out.print("Enter user name: ");
				String userName = scanner.nextLine();
				int libraryId = library.registerUser(userName);
				System.out.println("User registered successfully. Your Library ID is: " + libraryId);
				break;
			case 2:
				System.out.print("Enter book title: ");
				String title = scanner.nextLine();
				System.out.print("Enter author: ");
				String author = scanner.nextLine();
				System.out.print("Enter category: ");
				String category = scanner.nextLine();
				library.addBook(title, author, category);
				break;
			case 3:
				System.out.print("Enter category to display books: ");
				String displayCategory = scanner.nextLine();
				library.displayBooksByCategory(displayCategory);
				break;
			case 4:
				library.displayBooks();
				break;
			case 5:
				System.out.print("Enter your Library ID: ");
				int borrowerId = scanner.nextInt();
				scanner.nextLine(); // Consume the newline
				System.out.print("Enter book title to borrow: ");
				String borrowTitle = scanner.nextLine();
				library.borrowBook(borrowerId, borrowTitle);
				break;
			case 6:
				System.out.print("Enter your Library ID: ");
				int returnerId = scanner.nextInt();
				scanner.nextLine(); // Consume the newline
				System.out.print("Enter book title to return: ");
				String returnTitle = scanner.nextLine();
				library.returnBook(returnerId, returnTitle);
				break;
			case 7:
				System.out.print("Enter your Library ID: ");
				int userId = scanner.nextInt();
				library.displayUserTransactions(userId);
				break;
			case 8:
				System.out.println("Exiting Library Management System. Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 8.");
			}
		}
	}
}
