class Person extends Docter {

    public byte familyMembers;
    public short heightInCm;
    public int age;
    public long addharNumber;
    public float weight;
    public double bankBalance;
    public char gender;
    public boolean isMarried;

    
    public Person(byte familyMembers, short heightInCm, int age, long addharNumber, float weight, double bankBalance, char gender, boolean isMarried) {
        
        super();
        this.familyMembers = familyMembers;
        this.heightInCm = heightInCm;
        this.age = age;
        this.addharNumber = addharNumber;
        this.weight = weight;
        this.bankBalance = bankBalance;
        this.gender = gender;
        this.isMarried = isMarried;
    }

    
    public void displayPerson() {
        System.out.println("Family Members: " + this.familyMembers);
        System.out.println("Height (in cm): " + this.heightInCm);
        System.out.println("Age: " + this.age);
        System.out.println("Adhar Number: " + this.addharNumber);
        System.out.println("Weight (in kg): " + this.weight);
        System.out.println("Bank Balance: " + this.bankBalance);
        System.out.println("Gender: " + this.gender);
        System.out.println("Is Married: " + this.isMarried);

        System.out.println("Working Hours Per Day: " + super.workingHoursPerDay);
        System.out.println("Clinic Rooms: " + super.clinicRooms);
		System.out.println("Experience: " + super.experience);
        System.out.println("Doctor ID: " + super.doctorId);
        System.out.println("Rating: " + super.rating);
        System.out.println("Salary: " + super.salary);
        System.out.println("Grade: " + super.grade);
        System.out.println("Is Surgeon: " + super.isSurgeon);
    }
}