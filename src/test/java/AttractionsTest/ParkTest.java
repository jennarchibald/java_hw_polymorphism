package AttractionsTest;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    @Before
    public void before(){
        park = new Park("Princes Street Gardens", 7);
    }

    @Test
    public void hasName(){
        assertEquals("Princes Street Gardens", park.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(7, park.getRating());
    }
}
