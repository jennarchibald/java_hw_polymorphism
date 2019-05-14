package Stalls;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Visitors.Visitor;

public abstract class Stall implements IReviewed, ITicketed {

    protected String name;
    protected String ownerName;
    protected int parkingSpot;
    protected int rating;
    protected double price;

    public Stall(String name, String ownerName, int parkingSpot, int rating, double price) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public int getRating() {
        return rating;
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        return price;
    }
}
