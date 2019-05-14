package Attractions;

import Interfaces.IReviewed;
import Visitors.Visitor;

public abstract class Attraction implements IReviewed {

    protected String name;
    protected int rating;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String visit(Visitor visitor){
        return name + " was fun!";
    };
}
