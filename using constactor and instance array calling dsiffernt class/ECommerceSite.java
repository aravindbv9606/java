 class ECommerceSite {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Smartphone", 14999.99);
        Product p2 = new Product(102, "Laptop", 49999.50);
       
        Product[] order = { p1, p2 }; 
		Customer customer = new Customer();

        customer.displayItems(order);
    }
}