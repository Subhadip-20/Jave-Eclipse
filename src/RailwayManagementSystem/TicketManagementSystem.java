package RailwayManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class TicketManagementSystem {
    private List<Ticket> tickets;
    private List<Train> trainTimetable;
    private List<User> users;


    public TicketManagementSystem() {
        tickets = new ArrayList<>();
        initializeTickets();
        initializeTrainTimetable();
        users = new ArrayList<>();
    }

    private void initializeTickets() {
        for (int i = 1; i <= 50; i++) {
            tickets.add(new Ticket(i, "Passenger" + i));
        }
    }

    private void initializeTrainTimetable() {
        trainTimetable = new ArrayList<>();
        
        // Adding train entries to the timetable with fare information
        trainTimetable.add(new Train(1, "Delhi", "Mumbai", "08:00 AM", 200));
        trainTimetable.add(new Train(2, "Mumbai", "Delhi", "10:30 AM", 250));
        trainTimetable.add(new Train(3, "Chennai", "Kolkata", "09:15 AM", 180));
        trainTimetable.add(new Train(4, "Kolkata", "Chennai", "11:45 AM", 220));
        
        trainTimetable.add(new Train(5, "Bangalore", "Hyderabad", "07:30 AM", 150));
        trainTimetable.add(new Train(6, "Hyderabad", "Bangalore", "12:00 PM", 200));
        trainTimetable.add(new Train(7, "Ahmedabad", "Pune", "10:45 AM", 170));
        trainTimetable.add(new Train(8, "Pune", "Ahmedabad", "02:30 PM", 190));
        
        trainTimetable.add(new Train(9, "Jaipur", "Lucknow", "06:15 AM", 160));
        trainTimetable.add(new Train(10, "Lucknow", "Jaipur", "01:45 PM", 210));
        trainTimetable.add(new Train(11, "Patna", "Ranchi", "11:00 AM", 180));
        trainTimetable.add(new Train(12, "Ranchi", "Patna", "03:30 PM", 200));
        
        trainTimetable.add(new Train(13, "Bhopal", "Indore", "08:45 AM", 150));
        trainTimetable.add(new Train(14, "Indore", "Bhopal", "01:15 PM", 190));
        trainTimetable.add(new Train(15, "Coimbatore", "Trichy", "10:00 AM", 170));
        trainTimetable.add(new Train(16, "Trichy", "Coimbatore", "02:45 PM", 200));
        
        trainTimetable.add(new Train(17, "Visakhapatnam", "Bhubaneswar", "09:30 AM", 160));
        trainTimetable.add(new Train(18, "Bhubaneswar", "Visakhapatnam", "12:30 PM", 180));
        trainTimetable.add(new Train(19, "Kochi", "Thiruvananthapuram", "11:15 AM", 200));
        trainTimetable.add(new Train(20, "Thiruvananthapuram", "Kochi", "04:00 PM", 220));
    }

    public void displayAvailableTickets() {
        System.out.println("Available Tickets:");
        for (Ticket ticket : tickets) {
            if (!ticket.isBooked()) {
                System.out.println(ticket);
            }
        }
    }
    public void displayTrainTimetable() {
        System.out.println("Train Timetable:");
        for (Train train : trainTimetable) {
            System.out.println(train);
        }
    }
    
    public User createUser(String userName) {
        User user = new User(userName);
        users.add(user);
        return user;
    }

    public void displayUserDetails(User user) {
        System.out.println(user);
        System.out.println("Booking History:");
        for (Ticket ticket : user.getBookingHistory()) {
            System.out.println(ticket);
        }
    }
    public User findUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    public void bookTicket(int seatNumber, int trainNumber, User user) {
        Ticket selectedTicket = findTicketBySeatNumber(seatNumber);
        Train selectedTrain = findTrainByNumber(trainNumber);

        if (selectedTicket != null && selectedTrain != null && !selectedTicket.isBooked()) {
            if (user.getBalance() >= selectedTrain.getFare()) {
                selectedTicket.bookTicket();
                user.deductBalance(selectedTrain.getFare());

                Ticket bookedTicket = new Ticket(selectedTicket.getSeatNumber(), user.getUserName());
                user.addToBookingHistory(bookedTicket);

                System.out.println("Ticket booked successfully:\n" + bookedTicket);
                System.out.println("Remaining Balance for " + user.getUserName() + ": Rs." + user.getBalance());
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Seat not available, already booked, or train not found.");
        }
    }

    private Ticket findTicketBySeatNumber(int seatNumber) {
        for (Ticket ticket : tickets) {
            if (ticket.getSeatNumber() == seatNumber) {
                return ticket;
            }
        }
        return null;
    }

    private Train findTrainByNumber(int trainNumber) {
        for (Train train : trainTimetable) {
            if (train.getTrainNumber() == trainNumber) {
                return train;
            }
        }
        return null;
    }
}
