class Customer {
   
    public void displayItems(Product[] products) {
       
        System.out.println("Ordered Products:");
        for (int num = 0; num < products.length; num++) {
            System.out.print(num);
            products[num].displayProduct();
        }
    }
}
