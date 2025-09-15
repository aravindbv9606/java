 class MallInfo {
    public static void main(String[] args) {
        Shop s1 = new Shop(1, "Reliance Trends");
        Shop s2 = new Shop(2, "Croma");
        Shop[] shops = { s1, s2 };

        Mall mall = new Mall();
        mall.displaymall(shops);
    }
}
