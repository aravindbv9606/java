class Manu extends Hero{
   public int numberOfContinents;
   public   long ageInYears;
   public  float gravity ;
   public double mass;
   public boolean hasLife;

    public Manu(int numberOfContinents,long ageInYears, float gravity , double mass, boolean hasLife) {
        
		super();
		
		this.numberOfContinents=numberOfContinents;
		this.ageInYears=ageInYears;
		this.gravity=gravity;
		this.mass=mass;
		this.hasLife=hasLife;
    }

    public void displayManuInfo() {
        
        System.out.println("Number of Continents: " + this.numberOfContinents);
        System.out.println("Age (years): " + this.ageInYears);
        System.out.println("Gravity: " + this.gravity);
        System.out.println("Mass: " + this.mass);
        System.out.println("Has Life: " +this.hasLife);
		System.out.println("weightid"+ super.age);
		System.out.println("animalId"+ super.height);	
		System.out.println("speed"+ super.weight);
		System.out.println("isDomesticated"+ super.grade);
		System.out.println("lifespan"+ super.isFamous);
		System.out.println("isDomesticated"+ super.netWorth);
		System.out.println("isDomesticated"+ super.heroType);

    }
}