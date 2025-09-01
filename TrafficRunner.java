class TrafficRunner {

    public static void main(String[] args) {

        int signalCount = Traffic.setSignalCount(18);
        float averageSpeed = Traffic.setAverageSpeed(32.5f);
        char trafficCode = Traffic.setTrafficCode('T');
        double fineAmount = Traffic.setFineAmount(1500.75);
        long vehicleCount = Traffic.setVehicleCount(98000L);
        boolean isHeavy = Traffic.setIsHeavy(true);
        String city = Traffic.setCity("Bengaluru");

        System.out.println(signalCount);
        System.out.println(averageSpeed);
        System.out.println(trafficCode);
        System.out.println(fineAmount);
        System.out.println(vehicleCount);
        System.out.println(isHeavy);
        System.out.println(city);
    }
}