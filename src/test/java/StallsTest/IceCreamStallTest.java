package StallsTest;

import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Ices", "Mary", 3, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Ices", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Mary", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(3, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(6, iceCreamStall.getRating());
    }
}