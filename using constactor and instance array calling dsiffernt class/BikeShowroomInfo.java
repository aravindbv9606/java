class BikeShowroomInfo {
    public static void main(String[] args) {
        Bike b1 = new Bike("Yamaha", "R15", 165000);
        Bike b2 = new Bike("Royal Enfield", "Classic 350", 195000);
        Bike[] bikeList = { b1, b2 };

        Showroom showroom = new Showroom();
        showroom.displayBikes(bikeList);
}
}
