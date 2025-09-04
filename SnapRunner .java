 class SnapRunner {
    public static void main(String[] args) {
        Snap.snapInfo();

        Snap s1 = new Snap();
        Snap s2 = new Snap("SnapChat", 300);
        Snap s3 = new Snap(400, "SnapChat", 5.5f);
        Snap s4 = new Snap(4.5, "SnapChat", 6.0f, 500);
        Snap s5 = new Snap(100000L, 4.8, "SnapChat", 7.0f, 600);
        Snap s6 = new Snap('A', 120000L, 4.9, "SnapChat", 8.0f, 700);
        Snap s7 = new Snap(true, 'B', 150000L, 5.0, "SnapChat", 9.0f, 800);
    }
}
