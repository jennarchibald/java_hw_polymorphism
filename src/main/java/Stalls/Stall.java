package Stalls;

import Interfaces.IReviewed;

public abstract class Stall implements IReviewed {

    protected String name;
    protected String ownerName;
    protected int parkingSpot;
    protected int rating;

    public Stall(String name, String ownerName, int parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
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
}
