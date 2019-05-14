package AttractionsTest;

import Attractions.Park;
import Visitors.Visitor;
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

    @Test
    public void canbeVisited(){
        Visitor visitor = new Visitor(11, 170, 10.00);
        assertEquals("Princes Street Gardens was fun!", park.visit(visitor));
    }
    @Test
    public void isFree(){
        Visitor visitor = new Visitor(11, 170, 10.00);
        park.visit(visitor);
        assertEquals(10.00, visitor.getMoney(), 0.01);
    }
}
