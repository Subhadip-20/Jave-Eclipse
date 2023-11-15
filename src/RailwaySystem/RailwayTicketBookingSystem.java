package RailwaySystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RailwayTicketBookingSystem {
    public static void main(String[] args) throws IOException {
        BookingSystem bookingSystem = new BookingSystem();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Adding 10 cities with their fare values
        String[] cities = {"Mumbai", "Delhi", "Bangalore", "Chennai", "Kolkata", "Hyderabad", "Ahmedabad", "Pune", "Jaipur", "Lucknow"};
        int[] fares = {500, 600, 450, 550, 700, 400, 350, 480, 520, 600};
        // City names and fares are at corresponding indices

        while (true) {
            System.out.println("1. Book a Ticket");
            System.out.println("2. Display Booked Tickets");
            System.out.println("3. Cancel a Ticket");
            System.out.println("4. Search for Railway ID by Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    System.out.println("Available Cities:");
                    for (int i = 0; i < cities.length; i++) {
                        System.out.println((i + 1) + ". " + cities[i] + " - Fare: " + fares[i]);
                    }

                    System.out.print("Enter source (City Number): ");
                    int sourceIndex = Integer.parseInt(reader.readLine()) - 1;
                    String source = cities[sourceIndex];

                    System.out.print("Enter destination (City Number): ");
                    int destIndex = Integer.parseInt(reader.readLine()) - 1;
                    String destination = cities[destIndex];

                    System.out.print("Enter passenger name: ");
                    String passengerName = reader.readLine();
                    System.out.print("Enter passenger age: ");
                    int passengerAge = Integer.parseInt(reader.readLine());
                    System.out.print("Enter preferred time: ");
                    String time = reader.readLine();
                    System.out.print("Enter a unique railway ID: ");
                    String railwayId = reader.readLine();

                    Passenger passenger = new Passenger(passengerName, passengerAge, railwayId);
                    bookingSystem.bookTicket(source, destination, passenger, time);
                    break;
                case 2:
                    bookingSystem.displayTickets();
                    break;
                case 3:
                    System.out.print("Enter ticket number to cancel: ");
                    int ticketNumber = Integer.parseInt(reader.readLine());
                    bookingSystem.cancelTicket(ticketNumber);
                    break;
                case 4:
                    System.out.print("Enter passenger name to search: ");
                    String searchName = reader.readLine();
                    Ticket searchedTicket = bookingSystem.getTicketById(searchName);
                    if (searchedTicket != null) {
                        System.out.println("Railway ID found: " + searchedTicket.getPassenger().getRailwayId());
                    } else {
                        System.out.println("Railway ID not found for the given name.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
