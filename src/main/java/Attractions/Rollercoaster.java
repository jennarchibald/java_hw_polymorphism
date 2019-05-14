package Attractions;

import Interfaces.ISecurity;
import Visitors.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getAge() >= 12 && visitor.getHeight() >= 145);
    }
}
