package RailwayManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Train {
    private int trainNumber;
    private String sourceCity;
    private String destinationCity;
    private String departureTime;
    private int fare;

    public Train(int trainNumber, String sourceCity, String destinationCity, String departureTime, int fare) {
        this.trainNumber = trainNumber;
        this.sourceCity = sourceCity;
        this.destinationCity = destinationCity;
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Train Number: " + trainNumber +
                ", Source City: " + sourceCity +
                ", Destination City: " + destinationCity +
                ", Departure Time: " + departureTime;
    }
}
