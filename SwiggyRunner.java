 class SwiggyRunner {
    public static void main(String[] args) {
        Swiggy swiggy = new Swiggy(); 
        System.out.println();

        Swiggy sd = new Swiggy("Pizza Hut", 500);
        System.out.println();

        Swiggy sf = new Swiggy(600, "Domino's", 4.5f);
        System.out.println();

        Swiggy st = new Swiggy(30.5, "Burger King", 4.2f, 350);
        System.out.println();

        Swiggy.details();  
    }
}


