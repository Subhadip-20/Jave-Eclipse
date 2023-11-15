package RailwaySystem;

public class Ticket {
    private int ticketNumber;
    private String source;
    private String destination;
    private Passenger passenger;
    private String time; // Added time field for ticket

    public Ticket(int ticketNumber, String source, String destination, Passenger passenger, String time) {
        this.ticketNumber = ticketNumber;
        this.source = source;
        this.destination = destination;
        this.passenger = passenger;
        this.time = time;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getTime() {
        return time;
    }
}
