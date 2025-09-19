class Flipkart {
    public static void main(String[] args) {
        Application application = new Application("flipkart", true);
        Fashion fashion = new Fashion(10, "cotton", application);
        Mobile mobile1 = new Mobile(20, "realme", application);
        Electornics electronics = new Electornics(100, "watch", application);
        Beauty beauty = new Beauty(200, "facewashcream", application);
	    Furnature furniture = new Furnature(30, "sofa", application);

		Application offer = new Application("flipkart", true);		
	    Furnature  chera= new Furnature(30, "chera", offer);
		
		Application data = new Application("flipkart", true);
        Mobile mobile2 = new Mobile(20, "realme", data);


        fashion.displayFashion();
        mobile2.displayMobile();
        electronics.displayElectornics();
        beauty.displayBeauty();
        chera.displayFurnature();
    }
}
