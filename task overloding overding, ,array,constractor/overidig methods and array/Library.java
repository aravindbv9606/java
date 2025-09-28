class Library {
    String[] bookTitles = {"Java", "Python", "C++"};
    int[] bookIds = {101, 102, 103};
    char[] sections = {'A', 'B', 'C'};
    boolean[] isIssued = {false, true, false};

    public void displayLibraryDetails() {
        for (int library = 0; library < bookTitles.length; library++) {
            System.out.println("Book Title: " + bookTitles[library]);
            System.out.println("Book ID: " + bookIds[library]);
            System.out.println("Section: " + sections[library]);
            System.out.println("Is Issued: " + isIssued[library]);
            
        }
    }
}
