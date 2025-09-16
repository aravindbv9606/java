class Place {
    int productPrice;
    String productName;
   

    public Place(int productId, String productName, double price) {
        this.productPrice = productPrice;
        this.productName = productName;
        
    }

   public  void displayProduct() {
        System.out.println("productPrice: " + productPrice + ", Name: " + productName);
    }
}

