class Shop {
    public static void main(String[] ref) {
        int[] stock={1, 2, 3, 4};
        price(stock); 
    }
    public static void price(int[] stock) {
        System.out.println("Enter the elements:");

        for (int rupee=0; rupee<stock.length; rupee++) {
            System.out.println(stock[rupee]);
        }
    }
}

