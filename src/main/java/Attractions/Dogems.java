package Attractions;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class Dogems extends Attraction implements ITicketed {

    private double price;

    public Dogems(String name, int rating){
        super(name, rating);
        this.price = 4.5;
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12){
            return price /2;
        }
        return price;
    }

    public String visit(Visitor visitor){
        if (visitor.getMoney() >= price) {
            visitor.charge(priceFor(visitor));
            return name + " was fun!";
        }
        return "I can't afford that";
    }
}
