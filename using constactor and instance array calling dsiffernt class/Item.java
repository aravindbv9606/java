class Item {
    int itemId;
    String itemName;
    int quantity;

   public Item(int itemId, String itemName, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    void displayItem() {
        System.out.println("Item ID: " + itemId + ", Name: " + itemName + ", Quantity: " + quantity);
    }
}

