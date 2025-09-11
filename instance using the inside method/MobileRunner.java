class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        System.out.println("Brand: " + mobile.getBrand());
        System.out.println("RAM: " + mobile.getRam() + " GB");
        System.out.println("Storage: " + mobile.getStorage() + " GB");
        System.out.println("Screen Size: " + mobile.getScreenSize() + " inches");
        System.out.println("Supports 5G: " + mobile.has5G());
    }
}
