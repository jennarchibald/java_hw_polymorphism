package StallsTest;

import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Floss", "Mary", 2, 8);
    }

    @Test
    public void hasName() {
        assertEquals("Floss", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Mary", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(2, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(8, candyFlossStall.getRating());
    }
}