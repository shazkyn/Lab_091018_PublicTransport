import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    Bus(String destination, int capacity){
        this.capacity = capacity;
        this.destination = destination;
        passengers = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getDestination() {
        return this.destination;
    }

    public int passengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if (passengerCount() < this.capacity) {
            passengers.add(person);
        }
    }

    public void removePassenger() {
        passengers.remove(0);
    }
}
