class Shiva extends God {
  
   String name;
    int numberOfTemples;
    long ageInYears;
    float tandavaSpeed;
    double cosmicEnergy;
    char symbol;
    boolean isSupreme;

    
  

    
    public Shiva(String name, int numberOfTemples, long ageInYears,float tandavaSpeed, double cosmicEnergy, char symbol, boolean isSupreme) {
        super(); 
		this.name=name;
		
        
        this.numberOfTemples = numberOfTemples;
        this.ageInYears = ageInYears;
        this.tandavaSpeed = tandavaSpeed;
        this.cosmicEnergy = cosmicEnergy;
        this.symbol = symbol;
        this.isSupreme = isSupreme;
       
    }

    public void displayShivaInfo() {
        System.out.println(name);
       
        System.out.println("Number of Temples (int): " + this.numberOfTemples);
        System.out.println("Age in Years (long): " + this.ageInYears);
        System.out.println("Tandava Speed (float): " + this.tandavaSpeed);
        System.out.println("Cosmic Energy (double): " + this.cosmicEnergy);
        System.out.println("Symbol (char): " + this.symbol);
        System.out.println("Is Supreme (boolean): " + this.isSupreme);
		System.out.println("enter the name"+super.name);
		System.out.println("enter the mantra name:"+super.mantra);

        
        
      
    }
}
