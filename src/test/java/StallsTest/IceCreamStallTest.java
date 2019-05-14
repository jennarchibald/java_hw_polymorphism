package StallsTest;

import Stalls.IceCreamStall;
import Visitors.Visitor;
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

    @Test
    public void hasPrice(){
        Visitor visitor = new Visitor(12, 150, 22.50);
        assertEquals(2.8, iceCreamStall.priceFor(visitor), 0.01);
    }
}