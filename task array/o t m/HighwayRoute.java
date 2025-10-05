class HighwayRoute {
   public  int routeNumber;
  public  String routeName;
 public   GeoLocation location;

    public HighwayRoute(int routeNumber, String routeName, GeoLocation location) {
        this.routeNumber = routeNumber;
        this.routeName = routeName;
        this.location = location;
    }

    public void displayRoute() {
        System.out.println("Route: " + routeName + "  " + routeNumber );
		System.out.println("Location: " + location.locationName+location.isActive);
    }
}
