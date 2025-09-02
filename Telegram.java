class Telegram {
    public static int users = 500;

    public static void channelInfo() {
        System.out.println("Telegram users: " + users);
    }

    Telegram() {
        System.out.println("No-arg constructor: Telegram channel created");
    }

    Telegram(String channelName, int members) {
        System.out.println("Channel: " + channelName);
        System.out.println("Number of members: " + members);
    }

    Telegram(int members, String channelName, float activeHours) {
        System.out.println("Channel: " + channelName);
        System.out.println("Members: " + members);
        System.out.println("Active hours: " + activeHours);
    }

    Telegram(double rating, String channelName, float activeHours, int members) {
        System.out.println("Channel: " + channelName);
        System.out.println("Members: " + members);
        System.out.println("Active hours: " + activeHours);
        System.out.println("Rating: " + rating);
    }

    Telegram(long messages, double rating, String channelName, float activeHours, int members) {
        System.out.println("Channel: " + channelName);
        System.out.println("Members: " + members);
        System.out.println("Active hours: "+activeHours);
		System.out.println("Rating: " + rating);
        System.out.println("Messages sent: " + messages);
    }

    Telegram(char category, long messages, double rating, String channelName, float activeHours, int members) {
        System.out.println("Channel: " + channelName);
        System.out.println("Members: " + members);
        System.out.println("Active hours: " + activeHours);
        System.out.println("Rating: " + rating);
        System.out.println("Messages sent: " + messages);
        System.out.println("Category: " + category);
    }

    Telegram(boolean isVerified, char category, long messages, double rating, String channelName, float activeHours, int members) {
        System.out.println("Channel: " + channelName);
        System.out.println("Members: " + members);
        System.out.println("Active hours: " + activeHours);
        System.out.println("Rating: " + rating);
        System.out.println("Messages sent: " + messages);
        System.out.println("Category: " + category);
        System.out.println("Verified: " + isVerified);
    }
}
