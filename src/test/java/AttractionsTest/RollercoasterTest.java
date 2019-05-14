package AttractionsTest;

import Attractions.Rollercoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Menace", 6);
        visitor = new Visitor(11, 150, 10.50);
        visitor1 = new Visitor(11,140, 9.50);
        visitor2 = new Visitor(13,201, 9.50);
    }

    @Test
    public void hasName(){
        assertEquals("Menace", rollercoaster.getName());
    }

    @Test
    public void visitorMustBeOver12AndTallerThan145(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
        assertEquals(false, rollercoaster.isAllowedTo(visitor1));
        assertEquals(true, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void hasRating(){
        assertEquals(6, rollercoaster.getRating());
    }

    @Test
    public void hasPrice(){
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargesDoubleIfOver200cmTall(){
        assertEquals(8.4, rollercoaster.priceFor(visitor), 0.01);
        assertEquals(16.8, rollercoaster.priceFor(visitor2), 0.01);
    }


    @Test
    public void canBeVisited(){
        Visitor visitor = new Visitor(11, 170, 10.00);
        assertEquals("Menace was fun!", rollercoaster.visit(visitor));
        assertEquals(1.60, visitor.getMoney(), 0.01);
    }

    @Test
    public void cannotVisitIfCannotPay(){
        Visitor visitor = new Visitor(11, 170, 1.00);
        assertEquals("I can't afford that", rollercoaster.visit(visitor));
        assertEquals(1.00, visitor.getMoney(), 0.01);
    }
}
