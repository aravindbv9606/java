class VegetablesRunner {

    public static void main(String[] args) {

        int quantity = Vegetables.setQuantity(10);
        float weight = Vegetables.setWeight(2.5f);
        char grade = Vegetables.setGrade('A');
        double price = Vegetables.setPrice(45.75);
        long stock = Vegetables.setStock(1500L);
        boolean isFresh = Vegetables.setFresh(true);
        String name = Vegetables.setName("Tomato");

        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Weight: " + weight);
        System.out.println("Grade: " + grade);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Fresh: " + isFresh);
    }
}