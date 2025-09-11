class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        System.out.println("Brand: " + laptop.getBrand());
        System.out.println("Processor: " + laptop.getProcessor());
        System.out.println("RAM: " + laptop.getRam() + " GB");
        System.out.println("Storage: " + laptop.getStorage() + " GB");
        System.out.println("SSD: " + laptop.isSSD());
    }
}

