package Interfaces;

import Visitors.Visitor;

public interface ITicketed {

    double defaultPrice();

    double priceFor(Visitor visitor);

}
