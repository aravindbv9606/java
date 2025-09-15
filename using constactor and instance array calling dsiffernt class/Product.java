class Product {
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
       void displayProduct(){
		System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: ₹" + price);
    }
}
