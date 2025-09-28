class OverrideRunner {
    public static void main(String[] args) {
       
        DataTypeChild child = new DataTypeChild();
 
        child.show(20);
        child.show(20.5f);
        child.show(987654321L);
        child.show(199.99);
        child.show('B');
        child.show(false);
        child.show("Hello Child");
    }
}
