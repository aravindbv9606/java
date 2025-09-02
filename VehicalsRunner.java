class VehicalsRunner {
    public static void main(String[] args) {
       Vehicals vehicals = new Vehicals();
       Vehicals vehicalsdetias = new Vehicals("Rose", 50);
		Vehicals vehicalsname = new Vehicals(10, "sent", 60f);
		Vehicals vehicalsno= new Vehicals(200, "yellow", 60f,70);
		Vehicals vehicalsfulldetilas= new Vehicals(123456789l,300, "red", 60f,70);
		Vehicals vehicalsplotno= new Vehicals('A',123456789l, 400,"purplle", 60f,70);
		Vehicals vehicalstype = new Vehicals(true,'A',2345678l,500, "pink", 60f,70);
		
		Vehicals.name();
		System.out.println("Accessing static price: " + Vehicals.price);
    }
}   
    