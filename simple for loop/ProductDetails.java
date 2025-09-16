class ProductDetails {
    int productId;
    String productName;
    double price;

    public ProductDetails(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

   public  void displayProduct() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: " + price);
    }
}

