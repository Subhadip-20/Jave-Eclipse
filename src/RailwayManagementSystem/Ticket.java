package RailwayManagementSystem;

public class Ticket {
    private int seatNumber;
    private String passengerName;
    private boolean isBooked;

    public Ticket(int seatNumber, String passengerName) {
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
        this.isBooked = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookTicket() {
        isBooked = true;
    }

    @Override
    public String toString() {
        return "Seat Number: " + seatNumber + ", Passenger: " + passengerName + ", Status: " + (isBooked ? "Booked" : "Available");
    }
}
