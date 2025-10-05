class Payment{
public int rupee;
public String nameOfPayment;
public Location location;

public Payment(int rupee,String nameOfPayment,Location location){
this.rupee=rupee;
this.nameOfPayment=nameOfPayment;
this.location=location;

}

public void displayPayment(){
System.out.println(nameOfPayment+rupee);
System.out.println(location.locationName+location.isHave);
}
}
