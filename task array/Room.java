class Room {
    int roomNumber;
    boolean isOccupied;
    double price;

    public Room(int roomNumber, boolean isOccupied, double price) {
        this.roomNumber = roomNumber;
        this.isOccupied = isOccupied;
        this.price = price;
    }

    public void display() {
        System.out.println("    Room ="+roomNumber+ ":"+ "Occupied="+isOccupied+ ":"+ "price="+price);
    }
}
