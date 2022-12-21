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
        return "в " + this.location;
    }

}
