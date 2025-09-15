class OnlineOrder {
    public void displayItems(Item[] items) {
        System.out.println("Items in Order:");
        for (int num = 0; num < items.length; num++) {
            System.out.print(num);
            items[num].displayItem();
        }
    }
}

