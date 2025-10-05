class License{
public int price;
public String nameOfLicense;
public Location location;

public License(int price,String nameOfLicense,Location location){
this.price=price;
this.nameOfLicense=nameOfLicense;
this.location=location;

}

public void displayLicense(){
System.out.println(nameOfLicense+price);
System.out.println(location.locationName+location.isHave);
}
}
