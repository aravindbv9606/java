class Collection {
    public static int movieCollection(int movie) {
        System.out.println("MAX");

        int weekCollection = 0;
        if (movie == 1) {
            weekCollection = 1000;
        }

        int maxMovieRating = 9;
        int kingdomMovieRating = 8;

        int[] review = {maxMovieRating, kingdomMovieRating};
        System.out.println("Movie Reviews:");

        for (int film = 0; film < review.length; film++) {
            System.out.println("Rating: " + review[film]);
        }

        return weekCollection;
    }
}
