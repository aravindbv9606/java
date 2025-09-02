class StorageRunner {
    public static void main(String[] args) {
        Storage.storageInfo();

        Storage s1 = new Storage();
        Storage s2 = new Storage("Warehouse A", 1500);
        Storage s3 = new Storage(2000, "Warehouse B", 22.5f);
        Storage s4 = new Storage(50.5, "Warehouse C", 20.0f, 1800);
        Storage s5 = new Storage(10000L, 70.2, "Warehouse D", 19.5f, 2000);
        Storage s6 = new Storage('L', 12000L, 65.0, "Warehouse E", 18.0f, 2100);
        Storage s7 = new Storage(true, 'S', 15000L, 60.0, "Warehouse F", 17.0f, 2500);
    }
}
