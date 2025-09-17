class BookRunner {
    public static void main(String[] args) {
        Auther auther = new Auther("sunmicrosoft");
		Book book = new Book(auther);
		System.out.println(book.name);
        
    }
}
