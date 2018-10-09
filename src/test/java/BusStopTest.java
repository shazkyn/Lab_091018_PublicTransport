import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop;
    Person person;
    @Before
    public void before(){
        busStop = new BusStop("Castle Terrace");
        person = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("Castle Terrace", busStop.getName());
    }

    @Test
    public void queue(){
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void addPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueue());
    }

    @Test
    public void removePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        assertEquals(2, busStop.getQueue());
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.getQueue());
    }
}
