class Shop {
    int shopId;
    String shopName;

  public  Shop(int shopId, String shopName) {
        this.shopId = shopId;
        this.shopName = shopName;
    }

   public void displayShop() {
        System.out.println("Shop ID: " + shopId + ", Name: " + shopName);
    }
}


