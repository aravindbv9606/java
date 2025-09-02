class YouTube {
    public static int subscribers = 1000;

    public static void channelInfo() {
        System.out.println("YouTube channel subscribers: " + subscribers);
    }

    YouTube() {
        System.out.println("No-arg constructor: YouTube channel created");
    }

    YouTube(String channelName, int videos) {
        System.out.println("Channel: " + channelName);
        System.out.println("Number of videos: " + videos);
    }

    YouTube(int videos, String channelName, float hoursWatched) {
        System.out.println("Channel: " + channelName);
        System.out.println("Videos: " + videos);
        System.out.println("Hours watched: " + hoursWatched);
    }

    YouTube(double rating, String channelName, float hoursWatched, int videos) {
        System.out.println("Channel: " + channelName);
        System.out.println("Videos: " + videos);
        System.out.println("Hours watched: " + hoursWatched);
        System.out.println("Rating: " + rating);
    }

    YouTube(long views, double rating, String channelName, float hoursWatched, int videos) {
        System.out.println("Channel: " + channelName);
        System.out.println("Videos:"+videos);
		System.out.println("Hours watched: " + hoursWatched);
        System.out.println("Rating: " + rating);
        System.out.println("Views: " + views);
    }

    YouTube(char category, long views, double rating, String channelName, float hoursWatched, int videos) {
        System.out.println("Channel: " + channelName);
        System.out.println("Videos: " + videos);
        System.out.println("Hours watched: " + hoursWatched);
        System.out.println("Rating: " + rating);
        System.out.println("Views: " + views);
        System.out.println("Category: " + category);
    }

    YouTube(boolean isMonetized, char category, long views, double rating, String channelName, float hoursWatched, int videos) {
        System.out.println("Channel: " + channelName);
        System.out.println("Videos: " + videos);
        System.out.println("Hours watched: " + hoursWatched);
        System.out.println("Rating: " + rating);
        System.out.println("Views: " + views);
        System.out.println("Category: " + category);
        System.out.println("Monetized: " + isMonetized);
    }
}

