class StoryRunner {

    public static void main(String[] args) {

        int pages = Story.setPages(120);
        float popularity = Story.setPopularity(8.6f);
        char category = Story.setCategoryCode('F');
        double price = Story.setPrice(299.99);
        long copies = Story.setCopiesSold(150000L);
        boolean fiction = Story.setIsFiction(true);
        String title = Story.setTitle("The Lost World");

        System.out.println(pages);
        System.out.println(popularity);
        System.out.println(category);
        System.out.println(price);
        System.out.println(copies);
        System.out.println(fiction);
        System.out.println(title);
    }
}