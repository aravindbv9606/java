class TronsportCompany{
public int packeg;
public String nameOfTronsportCompany;
 public  Location location;


public TronsportCompany(int packeg,String nameOfTronsportCompany,  Location location){
this.packeg=packeg;
this.nameOfTronsportCompany=nameOfTronsportCompany;
this.location=location;

}

public void displayTronsportCompany(){
System.out.println(nameOfTronsportCompany+packeg);
System.out.println(location.locationName+location.isHave);
}
}
