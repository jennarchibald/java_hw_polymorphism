package ThemePark;

import Attractions.Attraction;
import Attractions.Park;
import Interfaces.IReviewed;
import Stalls.Stall;
import Visitors.Visitor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(String name, ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.name = name;
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public String getName() {
        return name;
    }

    public int attractionCount() {
        return attractions.size();
    }

    public int stallCount() {
        return stalls.size();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        for(Attraction attraction : attractions){
            reviewed.add(attraction);
        }
        for (Stall stall : stalls) {
            reviewed.add(stall);
        }
        return reviewed;
    }

    public String visit(Visitor visitor, Attraction attraction) {
        if (this.attractions.contains(attraction)) {
            return attraction.getName() + " was great";
        } else {
            return attraction.getName() + " isn't here...";
        }
    }
}
