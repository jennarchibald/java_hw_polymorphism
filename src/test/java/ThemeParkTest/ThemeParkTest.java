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

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    Rollercoaster rollercoaster;
    Dogems dogems;
    Playground playground;
    Park park;
    Park shadyPines;


    BeerStall beerStall;
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;

    ArrayList<IReviewed> placesToVisit;

    Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Menace", 6);
        dogems = new Dogems("Bobs Dodges", 7);
        playground = new Playground("Tot Spot", 9);
        park = new Park("Green Acres", 7);
        shadyPines = new Park("Shady Pines", 7);

        placesToVisit = new ArrayList<>();

        placesToVisit.add(rollercoaster);
        placesToVisit.add(dogems);
        placesToVisit.add(playground);
        placesToVisit.add(park);

        beerStall = new BeerStall("Bobs Beers", "Bob", 1, 8);
        candyFlossStall = new CandyFlossStall("Fairy Floss", "Mary", 2, 9);
        iceCreamStall = new IceCreamStall("Frosties", "Mary", 3, 8);



        placesToVisit.add(beerStall);
        placesToVisit.add(candyFlossStall);
        placesToVisit.add(iceCreamStall);

        visitor = new Visitor(11, 160, 84.20);

        themePark = new ThemePark("Fantasy Land", placesToVisit);
    }

    @Test
    public void hasName(){
        assertEquals("Fantasy Land", themePark.getName());
    }

    @Test
    public void hasPlacesToVisit(){
        assertEquals(7, themePark.placesCount());
    }

    @Test
    public void canGetAllReviewed(){
        ArrayList<IReviewed> reviewed = themePark.getAllReviewed();
        assertEquals(7, reviewed.size());
    }

    @Test
    public void canVisitAttraction(){
        assertEquals("Green Acres was fun!", themePark.visit(visitor, park));
    }

    @Test
    public void cannotVisitAttractionNotInPark(){
        assertEquals("Shady Pines isn't here...", themePark.visit(visitor, shadyPines));
    }

    @Test
    public void canFindAllAllowedForVisitor(){
        ArrayList<IReviewed> allowedPlaces = themePark.getAllAllowedFor(visitor);
        assertEquals(5, allowedPlaces.size());
    }

    @Test
    public void cannotVisitIfNotAllowed(){
        assertEquals("I'm not allowed...", themePark.visit(visitor, rollercoaster));
    }

    @Test
    public void canGetAllReviews(){
        assertEquals("Menace: 6, Bobs Dodges: 7, Tot Spot: 9, Green Acres: 7, Bobs Beers: 8, Fairy Floss: 9, Frosties: 8", themePark.getAllReviews());
    }


}
