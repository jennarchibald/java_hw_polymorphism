package AttractionsTest;

import Attractions.Dogems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogemsTest {

    Dogems dogems;
    @Before
    public void before(){
        dogems = new Dogems("Bob's Dogems", 6);
    }

    @Test
    public void hasName(){
        assertEquals("Bob's Dogems", dogems.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(6, dogems.getRating());
    }

    @Test
    public void hasPrice(){
        assertEquals(4.5, dogems.defaultPrice(), 0.01);
    }

    @Test
    public void chargesHalfPriceForUnder18(){
        Visitor visitor = new Visitor(11, 170, 10.00);
        Visitor visitor1 = new Visitor(13, 170, 10.00);
        assertEquals(4.5, dogems.priceFor(visitor1), 0.01);
        assertEquals(2.25, dogems.priceFor(visitor), 0.01);
    }

    @Test
    public void canBeVisited(){
        Visitor visitor = new Visitor(11, 170, 10.00);
        assertEquals("Bob's Dogems was fun!", dogems.visit(visitor));
        assertEquals(7.75, visitor.getMoney(), 0.01);
    }

    @Test
    public void cannotVisitIfCannotPay(){
        Visitor visitor = new Visitor(11, 170, 1.00);
        assertEquals("I can't afford that", dogems.visit(visitor));
        assertEquals(1.00, visitor.getMoney(), 0.01);
    }
}
