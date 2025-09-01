class HolidaysRunner {
    public static void main(String[] args) {
        int days = Holidays.setDays(7);
        float temp = Holidays.setAverageTemp(30.5f);
        char initial = Holidays.setInitial('H');
        double budget = Holidays.setBudget(15000.75);
        long visitors = Holidays.setVisitors(500000L);
        boolean isPublicHoliday = Holidays.setIsPublicHoliday(true);
        String name = Holidays.setName("New Year");
        System.out.println(days);
        System.out.println(temp);
        System.out.println(initial);
        System.out.println(budget);
        System.out.println(visitors);
        System.out.println(isPublicHoliday);
        System.out.println(name);
    }
}