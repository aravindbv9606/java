class Driver{
public static void main(String [] args){

Location location=new Location("bhashyem circle",true);;
Payment Payment=new Payment(20,"upi",location);
Trip Trip=new Trip(12,"vanitrip",location);
TronsportCompany TronsportCompany=new TronsportCompany(120,"lakshmiautocompany",location);
Route Route=new Route(12,"NH7",location);
Vehicle Vehicle=new Vehicle(13,"omani",location);
License License=new License(2,"twoInine",location);
Payment.displayPayment();
Trip.displayTrip();
TronsportCompany.displayTronsportCompany();
Route.displayRoute();
Vehicle.displayVehicle();
License.displayLicense();

}
}