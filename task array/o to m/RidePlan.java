class RidePlan {
   public int tripId;
   public String tripName;
 public GeoLocation location;

    public RidePlan(int tripId, String tripName, GeoLocation location) {
        this.tripId = tripId;
        this.tripName = tripName;
        this.location = location;
    }

    public void displayRidePlan() {
        System.out.println("RidePlan ID: " + tripId + ", Name: " + tripName);
		System.out.println("Location: " + location.locationName+location.isActive);
	}
	
}
