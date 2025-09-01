class Veg {
    public static void idle() {
        System.out.println("Sambar Idli");
    }

    public static void palav() {
        System.out.println("Vegetable Palav");
        idle();
    }

    public static void papad() {
        System.out.println("Papad");
        palav();
    }
}