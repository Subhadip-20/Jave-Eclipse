package RailwayManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int nextUserId = 1;

    private int userId;
    private String userName;
    private int balance;
    private List<Ticket> bookingHistory;

    public User(String userName) {
        this.userId = nextUserId++;
        this.userName = userName;
        this.balance = 500; // Initial balance is set to Rs.500
        this.bookingHistory = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getBalance() {
        return balance;
    }

    public List<Ticket> getBookingHistory() {
        return bookingHistory;
    }

    public void deductBalance(int amount) {
        balance -= amount;
    }

    public void addToBookingHistory(Ticket ticket) {
        bookingHistory.add(ticket);
    }

    @Override
    public String toString() {
        return "User ID: " + userId +
                ", User Name: " + userName +
                ", Balance: Rs." + balance;
    }
}
