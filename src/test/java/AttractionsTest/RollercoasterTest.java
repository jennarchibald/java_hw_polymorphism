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
        visitor2 = new Visitor(13,150, 9.50);
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
}
