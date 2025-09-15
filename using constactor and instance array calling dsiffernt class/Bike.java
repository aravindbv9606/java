class Bike {
    String brand;
    String model;
    double price;

    Bike(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayBike() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: ₹" + price);
    }
}
