public class Storage {
    public static int capacity = 1000;

    public static void storageInfo() {
        System.out.println("Storage capacity: " + capacity + " GB");
    }

    Storage() {
        System.out.println("No-arg constructor: Storage unit created");
    }

    Storage(String location, int capacity) {
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " GB");
    }

    Storage(int capacity, String location, float temperature) {
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " GB");
        System.out.println("Temperature: " + temperature + " °C");
    }

    Storage(double size, String location, float temperature, int capacity) {
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " GB");
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Size: " + size + " cubic meters");
    }

    Storage(long itemsStored, double size, String location, float temperature, int capacity) {
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity+"GB");
		System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Size: " + size + " cubic meters");
        System.out.println("Items stored: " + itemsStored);
    }

    Storage(char storageType, long itemsStored, double size, String location, float temperature, int capacity) {
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " GB");
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Size: " + size + " cubic meters");
        System.out.println("Items stored: " + itemsStored);
        System.out.println("Storage type: " + storageType);
    }

    Storage(boolean isClimateControlled, char storageType, long itemsStored, double size, String location, float temperature, int capacity) {
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " GB");
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Size: " + size + " cubic meters");
        System.out.println("Items stored: " + itemsStored);
        System.out.println("Storage type: " + storageType);
        System.out.println("Climate Controlled: " + isClimateControlled);
}
}
