package LibrarySystem;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	HashMap<String, ArrayList<Book>> categories;
	ArrayList<User> users;
	ArrayList<Transaction> transactions;
	int nextLibraryId;

	public Library() {
		this.categories = new HashMap<>();
		this.users = new ArrayList<>();
		this.transactions = new ArrayList<>();
		this.nextLibraryId = 1;
	}

	public int registerUser(String name) {
		int newLibraryId = nextLibraryId++;
		users.add(new User(name, newLibraryId));
		return newLibraryId;
	}

	public void addBook(String title, String author, String category) {
		categories.computeIfAbsent(category, k -> new ArrayList<>());
		categories.get(category).add(new Book(title, author, category));
	}

	public void displayBooksByCategory(String category) {
		if (categories.containsKey(category)) {
			System.out.println("Books in the " + category + " category:");
			for (Book book : categories.get(category)) {
				System.out.println(book.title + " by " + book.author + " - Available: " + (book.available ? "Yes" : "No"));
			}
		} else {
			System.out.println("Category not found.");
		}
	}

	public void displayBooks() {
		System.out.println("Books in the library:");
		for (ArrayList<Book> books : categories.values()) {
			for (Book book : books) {
				System.out.println(book.title + " by " + book.author + " - Available: " + (book.available ? "Yes" : "No"));
			}
		}
	}

	public void borrowBook(int userId, String title) {
		for (ArrayList<Book> books : categories.values()) {
			for (Book book : books) {
				if (book.title.equals(title) && book.available) {
					book.available = false;
					transactions.add(new Transaction(userId, title, true));
					System.out.println("Book borrowed successfully.");
					return;
				}
			}
		}
		System.out.println("Book not available for borrowing.");
	}

	public void returnBook(int userId, String title) {
		for (ArrayList<Book> books : categories.values()) {
			for (Book book : books) {
				if (book.title.equals(title) && !book.available) {
					book.available = true;
					transactions.add(new Transaction(userId, title, false));
					System.out.println("Book returned successfully.");
					return;
				}
			}
		}
		System.out.println("Invalid book title or the book is not borrowed.");
	}

	public void displayUserTransactions(int userId) {
		System.out.println("Transactions for User ID " + userId + ":");
		for (Transaction transaction : transactions) {
			if (transaction.userId == userId) {
				System.out.println("Book: " + transaction.bookTitle + ", " + (transaction.isBorrowed ? "Borrowed" : "Returned"));
			}
		}
	}
}
