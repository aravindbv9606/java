class HometownRunner {

    public static void main(String[] args) {

        int population = Hometown.setPopulation(150000);
        float temperature = Hometown.setTemperature(29.5f);
        char zone = Hometown.setZone('A');
        double area = Hometown.setArea(123.45);
        long pincode = Hometown.setPincode(561207L);
        boolean famous = Hometown.setFamous(true);
        String name = Hometown.setName("bagepalli");

        System.out.println(population);
        System.out.println(temperature);
        System.out.println(zone);
        System.out.println(area);
        System.out.println(pincode);
        System.out.println(famous);
        System.out.println(name);
    }
}