class FestivalRunner {
    public static void main(String[] args) {
        char symbol = Festival.setSymbol('F');
        double budget = Festival.setBudget(50000.0);
        long visitors = Festival.setVisitors(1000000L);
 boolean isHoliday = Festival.setPublicHoliday(true);
        String name = Festival.setName("Diwali");

        System.out.println(symbol);
        System.out.println(budget);
        System.out.println(visitors);
        System.out.println(isHoliday);
        System.out.println(name);
    }
}