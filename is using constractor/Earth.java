class Earth extends Planet{
   public int numberOfContinents;
   public   long ageInYears;
   public  float gravity ;
   public double mass;
   public boolean hasLife;

    public Earth(int numberOfContinents,long ageInYears, float gravity , double mass, boolean hasLife) {
        
		super();
		
		this.numberOfContinents=numberOfContinents;
		this.ageInYears=ageInYears;
		this.gravity=gravity;
		this.mass=mass;
		this.hasLife=hasLife;
    }

    public void displayEarthInfo() {
        System.out.println("Earth Information:");
        System.out.println("Number of Continents: " + this.numberOfContinents);
        System.out.println("Age (years): " + this.ageInYears);
        System.out.println("Gravity: " + this.gravity);
        System.out.println("Mass: " + this.mass);
        System.out.println("Has Life: " +this.hasLife);
		
		System.out.println("weightid"+super.numberOfMoons);
		System.out.println("animalId"+ super.distanceFromSun);	
		System.out.println("speed"+ super.gravity);
		System.out.println("lifespan"+ super.mass);
		System.out.println("isDomesticated"+ super.hasLife);
    }
}