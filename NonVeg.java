class NonVeg {
    public static void mutton() {
        
        System.out.println("Mutton Super");
        Veg.papad();
    }

    public static void chicken() {
        mutton();
        System.out.println("Chicken");
    }

    public static void tandoor() {
        chicken();
        System.out.println("Tandoor");
    }
}