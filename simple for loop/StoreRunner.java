class StoreRunner {
    public static void main(String[] args){
	    ProductDetails p1 = new ProductDetails(101, "Mobile", 14999.99);
        ProductDetails p2 = new ProductDetails(102, "Laptop", 45999.00);
        ProductDetails p3 = new ProductDetails(103, "Tablet", 19999.50);

        ProductDetails[] productsForCustomer1 = { p1,p2, p3 };
        Store store=new Store();
		store.displaystore(productsForCustomer1);

	}
}