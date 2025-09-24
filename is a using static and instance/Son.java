class Son extends Father {

    public static void setFatherName() {
        fatherName = "Raja";
        System.out.println("Father name set to: " + fatherName);
	}
		public void displaySonDetials(){
		 int age=24;
		 System.out.println("anther name: " + fatherName);
        System.out.println("son age: " + age);
		displayFatherDetails();
			
		}
    
}