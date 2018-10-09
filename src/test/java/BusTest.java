import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Ocean Terminal", 70);
        person = new Person();
//        busStop = new BusStop("Castle Terrace");
    }

    @Test
    public void getCapacity(){
        assertEquals(70, bus.getCapacity());
    }

    @Test
    public void getDestination(){
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    @Test
    public void passengerCount(){
        assertEquals(0, bus.passengerCount());
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
        Bus bus2 = new Bus("Royal Edinburgh Hospital", 2);
        bus2.addPassenger(person);
        bus2.addPassenger(person);
        assertEquals(2, bus2.passengerCount());
        bus2.addPassenger(person);
        assertEquals(2, bus2.passengerCount());
    }

    @Test
    public void passengerAlight(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.passengerCount());
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }
}
