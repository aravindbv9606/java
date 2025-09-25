class India extends Country {
    public int numberOfContinents;
    public long ageInYears;
    public float gravity;
    public double mass;
    public boolean hasLife;

    public India(int numberOfContinents, long ageInYears, float gravity, double mass, boolean hasLife) {
        super();
        this.numberOfContinents = numberOfContinents;
        this.ageInYears = ageInYears;
        this.gravity = gravity;
        this.mass = mass;
        this.hasLife = hasLife;
    }

    public void displayIndiaInfo() {
        System.out.println("India Information:");
        System.out.println("Number of Continents: " + this.numberOfContinents);
        System.out.println("Age (years): " + this.ageInYears);
        System.out.println("Gravity: " + this.gravity);
        System.out.println("Mass:"+ this.mass);
		System.out.println("Has Life: " + this.hasLife);
        System.out.println("Number of States (from Country): " + super.numberOfStates);
        System.out.println("Distance from Sun (from Country): " + super.distanceFromSun);
        System.out.println("Gravity (from Country): " + super.gravity);
        System.out.println("Mass (from Country): " + super.mass);
        System.out.println("Has Life (from Country): " + super.hasLife);
    }
}


 