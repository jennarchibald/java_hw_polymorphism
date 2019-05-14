package AttractionsTest;

import Attractions.Dogems;
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
}
