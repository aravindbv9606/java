class AnalogWatch {
    
    public static void tick(AnalogWatch analogWatch) {
		DigitalAnalog digitalAnalog=new DigitalAnalog();
		digitalAnalog.metr();
        System.out.println("Ticking sound from analog brand");
    }
}