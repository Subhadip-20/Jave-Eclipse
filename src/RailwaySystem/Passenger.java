package RailwaySystem;

public class Passenger {
    private String name;
    private int age;
    private String railwayId; // Added railwayId field

    public Passenger(String name, int age, String railwayId) {
        this.name = name;
        this.age = age;
        this.railwayId = railwayId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRailwayId() {
        return railwayId;
    }
}
