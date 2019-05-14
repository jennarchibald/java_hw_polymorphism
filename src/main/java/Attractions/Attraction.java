package Attractions;

import Interfaces.IReviewed;

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
}
