class DataTypeChild extends DataTypeParent {

   
    public void show(int value) {
		super.show(value);
        System.out.println("Child Integer: " + value);

        
    }

    
    public void show(float number) {
		super.show(number);
        System.out.println("Child Float: " + number);
		
    }

   
    public void show(long temp) {
		super.show(temp);
        System.out.println("Child Long: " + temp);

    }

    
    public void show(double value) {
		super.show(value);
        System.out.println("Child Double: " + value);
		
    }
	
    public void show(char value) {
		super.show(value);
        System.out.println("Child Char: " + value);
		
    }

   
    public void show(boolean value) {
		super.show(value);
        System.out.println("Child Boolean: " + value);
		
    }


    public void show(String value) {
		super.show(value);
        System.out.println("Child String: " + value);
		
    }
}
