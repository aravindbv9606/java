class Floors {
    public int noOfFloors;
    public String floorName;

    public Floors(int noOfFloors, String floorName) {
        this.noOfFloors = noOfFloors;
        this.floorName = floorName;
    }

    public void displayDetails() {
        System.out.println("No of Floor: " + noOfFloors);
        System.out.println("Floor Name: " + floorName);
    }
}
