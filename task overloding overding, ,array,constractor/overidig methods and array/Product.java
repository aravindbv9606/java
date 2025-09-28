class Product {
    int[] productIds = {201, 202, 203};
    String[] productNames = {"Laptop", "Phone", "Tablet"};
    float[] prices = {59999.99f, 19999.99f, 29999.99f};
    boolean[] isAvailable = {true, false, true};

    public void displayProductDetails() {
        for (int ids = 0; ids < productIds.length; ids++) {
            System.out.println("Product ID: " + productIds[ids]);
		}
			 for (int str = 0; str < productNames.length; str++) {
            System.out.println("productNames ID: " + productNames[str]);
			 }
           for (int pr = 0; pr < prices.length; pr++) {
            System.out.println("prices ID: " + prices[pr]);
		   }
             for (int is= 0; is < isAvailable.length; is++) {
            System.out.println("isAvailable ID: " + isAvailable[is]);
           
            
        }
    }
}
