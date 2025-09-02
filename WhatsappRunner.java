class WhatsappRunner {
    public static void main(String[] args) {
        Whatsapp.name();

        Whatsapp whatspp = new Whatsapp();
        Whatsapp whatsappd = new Whatsapp("Meta", 2000);
        Whatsapp whatsv = new Whatsapp(1500, "Meta", 5.5f);
        Whatsapp whatspps = new Whatsapp(6.7, "Meta", 4.4f, 1800);
        Whatsapp wfull = new Whatsapp(100L, 6.7, "Meta", 4.5f, 1900);
        Whatsapp wd = new Whatsapp(true, 'B', 200L, 5.5, "Meta", 4.0f, 1600);
    }
}