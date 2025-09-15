class Showroom {
    public void displayBikes(Bike[] bikes) {
        System.out.println("Available Bikes:");
        for (int num = 0; num < bikes.length; num++) {
            System.out.print(num);
            bikes[num].displayBike();
        }
    }
}
