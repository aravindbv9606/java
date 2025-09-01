class CarRunner  {
    public static void main(String[] args) {
        int[] name = {1,2,3,4,5};  
        int[] result = Car.display(name);
       
        for (int item = 0; item < result.length; item++) {
            System.out.println(result[item]);
        }
    }
}