class Vehicals {
public static int price=10;

 public static void name() {
 System.out.println("Vehicals name method called. Price is: " + price);
    }

       Vehicals() {
        System.out.println("No-arg constructor: Vehicals is ON");
    }

       Vehicals(String brand,int amount) {
        System.out.println("Vehicals brand: " + brand);
		 System.out.println(amount);
		
    }
	   Vehicals(int amount,String brand, float temp) {
        System.out.println("Vehicals brand: " + brand);
		System.out.println(amount);
		System.out.println(temp);
    } 
	Vehicals(double size,String brand, float temp,int amount) {
        System.out.println("Vehicals brand: " + brand);
		System.out.println(amount);
		System.out.println(temp);
		System.out.println(size);
    }	
	Vehicals( long phone,double size,String brand, float temp,int amount) {
        System.out.println("Vehicals brand: " + brand);
		System.out.println(amount);
		System.out.println(temp);
		System.out.println(size);
		System.out.println(phone);
    }
	
Vehicals(char grad, long phone,double size,String brand, float temp,int amount) {
        System.out.println("Vehicals brand: " + brand);
		System.out.println(amount);
		System.out.println(temp);
		System.out.println(size);
		System.out.println(phone);
		System.out.println(grad);
		
		
		
		
    }
	Vehicals( boolean isActive,char grad, long phone,double size,String brand, float temp,int amount) {
        System.out.println("Vehicals brand: " + brand);
		System.out.println(amount);
		System.out.println(temp);
		System.out.println(size);
		System.out.println(phone);
		System.out.println(grad);
		System.out.println(isActive);
}
}
