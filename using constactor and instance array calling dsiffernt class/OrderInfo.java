 class OrderInfo {
    public static void main(String[] args) {
        Item i1 = new Item(1, "Laptop", 1);
        Item i2 = new Item(2, "Mouse", 2);
        Item[] items = { i1, i2 };

        OnlineOrder order = new OnlineOrder();
        order.displayItems(items);
    }
}
