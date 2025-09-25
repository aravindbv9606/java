class Dog extends Animal {
    public String name;
    public int idNumber;            
    public long registrationNumber; 
    public float weight;            
    public double price;            
    public char grade;             
    public boolean isVaccinated;    

    
    public Dog(String name,int idNumber, long registrationNumber,
               float weight, double price, char grade, boolean isVaccinated) {
        super(); 
		this.name=name;
        
        this.idNumber = idNumber;
        this.registrationNumber = registrationNumber;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
        this.isVaccinated = isVaccinated;
    }

    public void displayDogDetails() {
        System.out.println("Dog Details:");
		System.out.println("name"+this.name);
       
        System.out.println("ID Number (int): " +this.idNumber);
        System.out.println("Registration Number (long): " + this.registrationNumber);
        System.out.println("Weight : " + this.weight);
        System.out.println("Price (double): ₹" + this.price);
        System.out.println("Grade (char): " + this.grade);
        System.out.println("Is Vaccinated (boolean): " + this.isVaccinated);
		System.out.println("name"+ super.name);
		System.out.println("weightid"+super.weightInKg);
		System.out.println("animalId"+ super.animalId);
		
		System.out.println("speed"+ super.speed);
		System.out.println("lifespan"+ super.lifespan);
		System.out.println("gender"+ super.gender);
		System.out.println("isDomesticated"+ super.isDomesticated);
	}
}