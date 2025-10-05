 class FleetPartner {
   public int partnerId;
 public   String companyName;
  public  GeoLocation location;

    public FleetPartner(int partnerId, String companyName, GeoLocation location) {
        this.partnerId = partnerId;
        this.companyName = companyName;
        this.location = location;
    }

    public void displayFleetPartner() {
        System.out.println("FleetPartner ID: " + partnerId + ", Company: " + companyName); 
		System.out.println("Location: " + location.locationName+location.isActive);
    }
}
