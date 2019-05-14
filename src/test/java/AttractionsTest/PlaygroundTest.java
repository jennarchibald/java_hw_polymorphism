package AttractionsTest;

import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Visitor visitor;
    Visitor visitor1;
    Playground playground;
    @Before
    public void before(){
        playground = new Playground("Tot Spot", 9);
        visitor = new Visitor(17, 160, 22.40);
        visitor1 = new Visitor(14, 160, 22.40);
    }

    @Test
    public void hasName(){
        assertEquals("Tot Spot", playground.getName());
    }

    @Test
    public void visitorMustBe15OrOver(){
        assertEquals(false, playground.isAllowedTo(visitor));
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void hasRating(){
        assertEquals(9, playground.getRating());
    }


    @Test
    public void canbeVisited(){
        assertEquals("Tot Spot was fun!", playground.visit(visitor));
    }
    @Test
    public void isFree(){
        playground.visit(visitor);
        assertEquals(22.40, visitor.getMoney(), 0.01);
    }
}
