 class AppLauncher {
    public static void main(String[] args) {
        GeoLocation location = new GeoLocation("City Center", true);

        DigitalPayment payment = new DigitalPayment(150, "UPI", location);
        RidePlan ride = new RidePlan(45, "Morning Ride", location);
        FleetPartner company = new FleetPartner(999, "FastGo Pvt Ltd", location);
        HighwayRoute route = new HighwayRoute(77, "Expressway", location);
        VehicleUnit vehicle = new VehicleUnit(301, "TataAce",location);
		PermitDetails permit = new PermitDetails(2022, "KA-05-6789", location);
        payment.displayPayment();
        ride.displayRidePlan();
        company.displayFleetPartner();
        route.displayRoute();
        vehicle.displayVehicleUnit();
        permit.displayPermitDetails();
    }
}
