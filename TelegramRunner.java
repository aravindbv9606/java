 class TelegramRunner {
    public static void main(String[] args) {
        Telegram t1 = new Telegram();
        Telegram t2 = new Telegram("TechTalk", 1500);
        Telegram t3 = new Telegram(1500, "TechTalk", 12.5f);
        Telegram t4 = new Telegram(4.5, "TechTalk", 12.5f, 1500);
        Telegram t5 = new Telegram(100000L, 4.5, "TechTalk", 12.5f, 1500);
        Telegram t6 = new Telegram('T', 100000L, 4.5, "TechTalk", 12.5f, 1500);
        Telegram t7 = new Telegram(true, 'T', 100000L, 4.5, "TechTalk", 12.5f, 1500);

        Telegram.channelInfo();
    }
}
