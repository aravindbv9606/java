class Trip{
public int totalPlaces;
public String nameOfTrip;
public Location location;

public Trip(int totalPlaces,String nameOfTrip,Location location){
this.totalPlaces=totalPlaces;
this.nameOfTrip=nameOfTrip;
this.location=location;

}

public void displayTrip(){
System.out.println(nameOfTrip+totalPlaces);
System.out.println(location.locationName+location.isHave);
}
}


