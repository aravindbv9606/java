class Mall {
    public void displaymall(Shop[] shops) {
        System.out.println("Shops in the Mall:");
        for (int num = 0; num < shops.length; num++) {
            System.out.print(num);
            shops[num].displayShop();
        }
    }
}
