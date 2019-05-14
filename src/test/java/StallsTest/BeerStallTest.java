package StallsTest;

import Stalls.BeerStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerStallTest {

    Visitor visitor;
    Visitor visitor1;
    BeerStall beerStall;
    @Before
    public void before(){
        visitor = new Visitor(14, 150, 10.50);
        visitor1 = new Visitor(18, 170, 10.50);
        beerStall = new BeerStall("Bobs Beers", "Bob", 1, 9);
    }

    @Test
    public void hasName(){
        assertEquals("Bobs Beers", beerStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Bob", beerStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, beerStall.getParkingSpot());
    }

    @Test
    public void vistorMustBe18orOver(){
        assertEquals(false, beerStall.isAllowedTo(visitor));
        assertEquals(true, beerStall.isAllowedTo(visitor1));
    }

    @Test
    public void hasRating(){
        assertEquals(9, beerStall.getRating());
    }

    @Test
    public void hasPrice(){
        assertEquals(6.60, beerStall.priceFor(visitor1), 0.01);
    }
}
