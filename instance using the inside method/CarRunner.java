class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());
        System.out.println("Is Electric: " + car.isElectric());
    }
}
