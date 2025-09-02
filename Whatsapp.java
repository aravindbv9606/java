class Whatsapp {
    public static int price = 10;

    public static void name() {
        System.out.println("Whatsapp name method called. Price is: " + price);
    }

    Whatsapp() {
        System.out.println("No-arg constructor: Whatsapp is ON");
    }

    Whatsapp(String brand, int amount) {
        System.out.println("Whatsapp brand: " + brand);
        System.out.println(amount);
    }

    Whatsapp(int amount, String brand, float temp) {
        System.out.println("Whatsapp brand: " + brand);
        System.out.println(amount);
        System.out.println(temp);
    }

    Whatsapp(double size, String brand, float temp, int amount) {
        System.out.println("Whatsapp brand: " + brand);
        System.out.println(amount);
        System.out.println(temp);
        System.out.println(size);
    }

    Whatsapp(long kg, double size, String brand, float temp, int amount) {
        System.out.println("Whatsapp brand: " + brand);
        System.out.println(amount);
        System.out.println(temp);
        System.out.println(size);
        System.out.println(kg);
    }
       
    

    Whatsapp(boolean isActive, char grad, long kg, double size, String brand, float temp, int amount) {
        System.out.println("Whatsapp brand: " + brand);
        System.out.println(amount);
        System.out.println(temp);
        System.out.println(size);
        System.out.println(kg);
        System.out.println(grad);
        System.out.println(isActive);
    }
}

