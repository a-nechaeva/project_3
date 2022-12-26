package Place;

public class Place {
    private Location location;

    public Place(Location location){
        if(location != null) this.location = location;
    }

    public String getLocation(){
        return toString();
    }

    @Override
    public String toString() {
        String house;
        switch (this.location) {
            case KENGAHOUSE -> house = "доме Кенги";
            case TIGRAHOUSE -> house = "доме Тигры";
            default -> house = "на улице";
        }
        return "в " + house;
    }

}
