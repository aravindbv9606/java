class YouTubeRunner {
    public static void main(String[] args) {
        new YouTube();
        new YouTube("TechReview",120);new YouTube(120, "TechReview", 1500.5f);
        new YouTube(4.8, "TechReview", 1500.5f, 120);
        new YouTube(5000000L, 4.8, "TechReview", 1500.5f, 120);
        new YouTube('T', 5000000L, 4.8, "TechReview", 1500.5f, 120);
        new YouTube(true, 'T', 5000000L, 4.8, "TechReview", 1500.5f, 120);
        YouTube.channelInfo();
    }
}
