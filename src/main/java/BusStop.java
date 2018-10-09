import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    BusStop(String name){
        this.name = name;
        queue = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getQueue() {
        return this.queue.size();
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }

    public Person removePersonFromQueue() {
        return this.queue.remove(0);
    }
}
