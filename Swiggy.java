class Swiggy {
    public static int deliveryCharge = 50;

    public static void details() {
        System.out.println("Swiggy delivery charge is: " + deliveryCharge);
    }

    Swiggy() {
        System.out.println("No-arg constructor: Welcome to Swiggy!");
    }

    Swiggy(String restaurant, int orderAmount) {
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Order Amount: " + orderAmount);
    }

    Swiggy(int orderAmount, String restaurant, float rating) {
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Order Amount: " + orderAmount);
        System.out.println("Customer Rating: " + rating);
    }

    Swiggy(double deliveryTime, String restaurant, float rating, int orderAmount) {
        System.out.println("Restaurant: " + restaurant);
        System.out.println("Order Amount: " + orderAmount);
        System.out.println("Customer Rating: " + rating);
        System.out.println("Delivery Time (mins): " + deliveryTime);
    }
}
