class ProducerRunner {
    public static void main(String[] args) {
        Custmoer custmoer = new Custmoer("stock");
		Producer book = new Producer(custmoer);
		System.out.println(book.name);
        
    }
}
