class Snap {
    public static int deliveriesAvailable = 200;

    public static void companyInfo() {
        System.out.println("Snap deliveries available: " + deliveriesAvailable);
    }

    Snap() {
        System.out.println("No-arg constructor: Snap delivery service started");
    }

    Snap(String city, int deliveryCount) {
        System.out.println("City: " + city);
        System.out.println("Deliveries in city: " + deliveryCount);
    }

    Snap(int deliveryCount, String city, float rating) {
        System.out.println("City: " + city);
        System.out.println("Delivery count: " + deliveryCount);
        System.out.println("Service rating: " + rating);
    }

    Snap(double averageDeliveryTime, String city, float rating, int deliveryCount) {
        System.out.println("City: " + city);
        System.out.println("Delivery count: " + deliveryCount);
        System.out.println("Rating: " + rating);
        System.out.println("Average Delivery Time: " + averageDeliveryTime + " mins");
    }

    Snap(long totalOrders, double averageDeliveryTime, String city, float rating, int deliveryCount) {
        System.out.println("City:"+city);
		System.out.println("Delivery count: " + deliveryCount);
        System.out.println("Rating: " + rating);
        System.out.println("Average Delivery Time: " + averageDeliveryTime + " mins");
        System.out.println("Total orders: " + totalOrders);
    }

    Snap(char deliveryType, long totalOrders, double averageDeliveryTime, String city, float rating, int deliveryCount) {
        System.out.println("City: " + city);
        System.out.println("Delivery count: " + deliveryCount);
        System.out.println("Rating: " + rating);
        System.out.println("Average Delivery Time: " + averageDeliveryTime + " mins");
        System.out.println("Total orders: " + totalOrders);
        System.out.println("Delivery Type: " + deliveryType);
    }

    Snap(boolean isExpress, char deliveryType, long totalOrders, double averageDeliveryTime, String city, float rating, int deliveryCount) {
        System.out.println("City: " + city);
        System.out.println("Delivery count: " + deliveryCount);
        System.out.println("Rating: " + rating);
        System.out.println("Average Delivery Time: " + averageDeliveryTime + " mins");
        System.out.println("Total orders: " + totalOrders);
        System.out.println("Delivery Type: " +deliveryType);
		System.out.println("Express Service: " + isExpress);
    }
}
