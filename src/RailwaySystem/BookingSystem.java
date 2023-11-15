package RailwaySystem;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<Ticket> tickets;
    private int ticketCounter;

    public BookingSystem() {
        this.tickets = new ArrayList<>();
        this.ticketCounter = 1;
    }

    public void bookTicket(String source, String destination, Passenger passenger, String time) {
        Ticket ticket = new Ticket(ticketCounter++, source, destination, passenger, time);
        tickets.add(ticket);
        System.out.println("Ticket booked successfully. Ticket number: " + ticket.getTicketNumber());
    }

    public void displayTickets() {
        System.out.println("List of booked tickets:");
        for (Ticket ticket : tickets) {
            System.out.println("Ticket Number: " + ticket.getTicketNumber());
            System.out.println("Source: " + ticket.getSource());
            System.out.println("Destination: " + ticket.getDestination());
            System.out.println("Passenger Name: " + ticket.getPassenger().getName());
            System.out.println("Passenger Age: " + ticket.getPassenger().getAge());
            System.out.println("Time: " + ticket.getTime());
            System.out.println("-------------------------------");
        }
    }

    public void cancelTicket(int ticketNumber) {
        tickets.removeIf(ticket -> ticket.getTicketNumber() == ticketNumber);
        System.out.println("Ticket canceled successfully.");
    }

    public Ticket getTicketById(String railwayId) {
        for (Ticket ticket : tickets) {
            if (ticket.getPassenger().getRailwayId().equals(railwayId)) {
                return ticket;
            }
        }
        return null;
    }
}
