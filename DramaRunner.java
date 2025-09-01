class DramaRunner {

    public static void main(String[] args) {

        int episodes = Drama.setEpisodeCount(50);
        float rating = Drama.setRating(4.7f);
        char grade = Drama.setGrade('A');
        double budget = Drama.setBudget(2500000.50);
        long viewers = Drama.setViewers(1250000L);
        boolean isOngoing = Drama.setIsOngoing(false);
        String title = Drama.setTitle("Twists of Fate");

        System.out.println(episodes);
        System.out.println(rating);
        System.out.println(grade);
        System.out.println(budget);
        System.out.println(viewers);
        System.out.println(isOngoing);
        System.out.println(title);
    }
}