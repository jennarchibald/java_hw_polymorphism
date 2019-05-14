package ThemeParkTest;

import Attractions.*;
import Interfaces.IReviewed;
import Stalls.BeerStall;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.Stall;
import ThemePark.ThemePark;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    Rollercoaster rollercoaster;
    Dogems dogems;
    Playground playground;
    Park park;
    Park shadyPines;

    ArrayList<Attraction> attractions;

    BeerStall beerStall;
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;

    ArrayList<Stall> stalls;

    Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Menace", 6);
        dogems = new Dogems("Bobs Dodges", 7);
        playground = new Playground("Tot Spot", 9);
        park = new Park("Green Acres", 7);
        shadyPines = new Park("Shady Pines", 7);

        attractions = new ArrayList<>();

        attractions.add(rollercoaster);
        attractions.add(dogems);
        attractions.add(playground);
        attractions.add(park);

        beerStall = new BeerStall("Bobs Beers", "Bob", 1, 8);
        candyFlossStall = new CandyFlossStall("Fairy Floss", "Mary", 2, 9);
        iceCreamStall = new IceCreamStall("Frosties", "Mary", 3, 8);

        stalls = new ArrayList<>();

        stalls.add(beerStall);
        stalls.add(candyFlossStall);
        stalls.add(iceCreamStall);

        visitor = new Visitor(11, 160, 84.20);

        themePark = new ThemePark("Fantasy Land", attractions, stalls);
    }

    @Test
    public void hasName(){
        assertEquals("Fantasy Land", themePark.getName());
    }

    @Test
    public void hasAttractions(){
        assertEquals(4, themePark.attractionCount());
    }

    @Test
    public void hasStalls(){
        assertEquals(3, themePark.stallCount());
    }

    @Test
    public void canGetAllReviewed(){
        ArrayList<IReviewed> reviewed = themePark.getAllReviewed();
        assertEquals(7, reviewed.size());
    }

    @Test
    public void canVisitAttraction(){
        assertEquals("Green Acres was great", themePark.visit(visitor, park));
    }

    @Test
    public void cannotVisitAttractionNotInPark(){
        assertEquals("Shady Pines isn't here...", themePark.visit(visitor, shadyPines));
    }

}
