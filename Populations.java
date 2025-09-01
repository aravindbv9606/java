class Populations {

    public static void pepels(String total) {
        int amount = 0;
        String name = "";

        if (total.equals("india")) {
            name = "India";
            amount = 200;
        } else if (total.equals("russia")) {
            name = "Russia";
            amount = 300;
        } else if (total.equals("america")) {
            name = "America";
            amount = 32;
        } else if (total.equals("uk")) {
            name = "UK";
            amount = 32;
        } else {
            name = "Australia";
            amount = 41;
        }

        System.out.println("Country: " + name);
        System.out.println("Population: " + amount);
    }

    public static void main(String[] args) {
        pepels("india");
    }
}