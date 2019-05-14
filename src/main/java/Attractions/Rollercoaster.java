package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    private double price;

    public Rollercoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;

    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getAge() >= 12 && visitor.getHeight() >= 145);
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200){
            return price * 2;
        }
        return price;
    }

    public String visit(Visitor visitor){
        if (visitor.getMoney() >= price) {
            visitor.charge(price);
            return name + " was fun!";
        }
        return "I can't afford that";
    }
}
