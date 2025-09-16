class OrderRunner {
    public static void main(String[] args){
	    Place p1 = new Place(101, "birany", 14999.99);
       Place p2 = new Place(102, "kabbab", 45999.00);
        Place p3 = new Place(103, "chill chiken", 19999.50);

        Place[] placetype = { p1,p2, p3 };
        Order Order=new Order();
		Order.displaystore(placetype);

	}
}