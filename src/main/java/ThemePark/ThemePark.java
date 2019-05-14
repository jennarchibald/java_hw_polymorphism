package ThemePark;

import Attractions.Attraction;
import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Visitors.Visitor;
import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> placesToVisit;

    public ThemePark(String name, ArrayList<IReviewed> placesToVisit) {
        this.name = name;
        this.placesToVisit = placesToVisit;
    }

    public String getName() {
        return name;
    }

    public int placesCount() {
        return placesToVisit.size();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return placesToVisit;
    }

    public String visit(Visitor visitor, Attraction attraction) {
        if (this.getAllAllowedFor(visitor).contains(attraction)) {
                return attraction.visit(visitor);
             } else if (this.placesToVisit.contains(attraction)) {
                 return "I'm not allowed...";
             } else {
            return attraction.getName() + " isn't here...";
        }
    }

    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor) {
        ArrayList<IReviewed> allowedPlaces = new ArrayList<>();
        for (IReviewed place : placesToVisit){
            if (place instanceof ISecurity && ((ISecurity) place).isAllowedTo(visitor)){
               allowedPlaces.add(place);
            } else if (!(place instanceof ISecurity)){
                allowedPlaces.add(place);
            }
        }
        return allowedPlaces;
    }

    public String getAllReviews() {
        String reviews = "";
        for (IReviewed place : placesToVisit){
            reviews += place.getName() + ": " + place.getRating() + ", ";
        }
        String allReviews = reviews.substring(0, reviews.length() -2);
        return allReviews;
    }
}
