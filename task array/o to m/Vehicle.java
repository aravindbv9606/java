class Vehicle{
public int range;
public String vehicleName;
public Location location;

public Vehicle(int range,String vehicleName,Location location){
this.range=range;
this.vehicleName=vehicleName;
this.location=location;

}

public void displayVehicle(){
System.out.println(vehicleName+range);
System.out.println(location.locationName+location.isHave);
}
}
