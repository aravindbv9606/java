 class DestinationRunner {

    public static void main(String[] args) {

        int distance = Destination.setDistance(250);
        float rating = Destination.setRating(4.7f);
        char zone = Destination.setZoneCode('A');
        double fee = Destination.setEntryFee(125.50);
        long visitors = Destination.setVisitors(500000L);
        boolean popular = Destination.setIsPopular(true);
        String name = Destination.setName("ooty");

        System.out.println(distance);
        System.out.println(rating);
        System.out.println(zone);
        System.out.println(fee);
        System.out.println(visitors);
        System.out.println(popular);
        System.out.println(name);
    }
}