package RailwayManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        TicketManagementSystem ticketManagementSystem = new TicketManagementSystem();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nRailway Ticket Management System");
            System.out.println("1. Display Available Tickets");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Display Train Timetable");
            System.out.println("4. Create User");
            System.out.println("5. Display User Details");
            System.out.println("6. Exit");

            try {
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        ticketManagementSystem.displayAvailableTickets();
                        break;
                    case 2:
                    	int ticketNumber = getIntegerInput("Enter the ticket number to book: ");
                        int trainNumber = getIntegerInput("Enter the train number: ");
                        User user = ticketManagementSystem.createUser(getUserNameInput("Enter your user name: "));
                        ticketManagementSystem.bookTicket(ticketNumber, trainNumber, user);
                        break;
                    case 3:
                        ticketManagementSystem.displayTrainTimetable();
                        break;
                    case 4:
                        System.out.print("Enter your user name: ");
                        String userName = reader.readLine();
                        User newUser = ticketManagementSystem.createUser(userName);
                        System.out.println("User created successfully:\n" + newUser);
                        break;
                    case 5:
                        System.out.print("Enter your user ID: ");
                        int userId = Integer.parseInt(reader.readLine());
                        User existingUser = ticketManagementSystem.findUserById(userId);
                        if (existingUser != null) {
                            ticketManagementSystem.displayUserDetails(existingUser);
                        } else {
                            System.out.println("User not found.");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting the program. Thank you!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error reading input. Please try again.");
            }
        }
    }
    private static int getIntegerInput(String prompt) throws IOException {
        System.out.print(prompt);
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    private static String getUserNameInput(String prompt) throws IOException {
        System.out.print(prompt);
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}
