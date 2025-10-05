class DigitalPayment {
   public int amount;
   public String mode;
   public  GeoLocation location;

    public DigitalPayment(int amount, String mode, GeoLocation location) {
        this.amount = amount;
        this.mode = mode;
        this.location = location;
    }

    public void displayPayment() {
        System.out.println("Payment: ₹" + amount + " via " + mode);
		System.out.println("Location: " + location.locationName+location.isActive);
    }
}


