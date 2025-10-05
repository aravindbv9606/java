class Route{
public int km;
public String nameOfRoute;
public  Location location;

public Route(int km,String nameOfRoute, Location location){
this.km=km;
this.nameOfRoute=nameOfRoute;
this.location=location;

}

public void displayRoute(){
System.out.println(nameOfRoute+km);
System.out.println(location.locationName+location.isHave);
}
}
