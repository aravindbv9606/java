class VehicleUnit {
    int vehicleId;
    String model;
    GeoLocation location;

    public VehicleUnit(int vehicleId, String model, GeoLocation location) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.location =location;
}
public void displayVehicleUnit() {
        System.out.println("Vehicle ID: " + vehicleId + ", Model: " + model);
		System.out.println("Location: " + location.locationName+location.isActive);
    }
}

