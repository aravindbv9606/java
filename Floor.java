 class Floor {
    int floorNumber;
    Room[] rooms;

    public Floor(int floorNumber, Room[] rooms) {
        this.floorNumber = floorNumber;
        this.rooms = rooms;
    }

    public void display() {
        System.out.println("  Floor " + floorNumber + ":");
        for (Room room : rooms) {
            room.display();
        }
    }
}
