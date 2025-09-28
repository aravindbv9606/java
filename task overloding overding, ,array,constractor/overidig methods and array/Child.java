class Child extends Parent {
    
    public void show(int val) {
        super.show(val);
        System.out.println("Child Integer: " + val);
    }

   
    public void show(String val) {
        super.show(val);
        System.out.println("Child String: " + val);
    }

   
    public void show(double val) {
        super.show(val);
        System.out.println("Child Double: " + val);
    }
}