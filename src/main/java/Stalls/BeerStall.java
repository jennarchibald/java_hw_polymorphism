package Stalls;

import Interfaces.ISecurity;
import Visitors.Visitor;

public class BeerStall extends Stall implements ISecurity {

    public BeerStall(String name, String ownername, int parkingSpot, int rating) {
        super(name, ownername, parkingSpot, rating, 6.60);
    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getAge() >= 18);
    }
}
