class PvrRunner  {
    public static void main(String[] args) {
        String[] name = {"aravind","mohan","suri"};  
        String [] result = Pvr.Movie(name);
       
        for (int item = 0; item < result.length; item++) {
            System.out.println(result[item]);
        }
    }
}