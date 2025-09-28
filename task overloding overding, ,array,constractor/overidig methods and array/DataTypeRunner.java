class DataTypeRunner {
    public static void main(String[] args) {
        DataTypeDemo demo = new DataTypeDemo();

        demo.show(10);             
        demo.show(10.5f);          
        demo.show(123456789L);     
        demo.show(99.99);          
        demo.show('A');            
        demo.show(true);           
        demo.show("Hello Java");   
    }
}