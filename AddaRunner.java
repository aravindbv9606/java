 class AddaRunner {
    public static void main(String[] args) {
        int duration = Adda.setDuration(3);
        float noiseLevel = Adda.setNoiseLevel(75.5f);
        char initial = Adda.setInitial('A');
        double popularity = Adda.setPopularity(8.7);
        long attendees = Adda.setAttendees(100L);
        boolean isIndoor = Adda.setIsIndoor(false);
        String place = Adda.setPlace("Cafe");

        System.out.println(duration);
        System.out.println(noiseLevel);
        System.out.println(initial);
        System.out.println(popularity);
        System.out.println(attendees);
        System.out.println(isIndoor);
        System.out.println(place);
    }
}