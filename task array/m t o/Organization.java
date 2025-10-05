class Organization {
   public String organizationName;
   public int annualBudget;
    public Division division;
    public Member member;
    public Registration registration;

    public Organization(String organizationName, int annualBudget, Division division, Member member, Registration registration) {
        this.organizationName = organizationName;
        this.annualBudget = annualBudget;
        this.division = division;
        this.member = member;
        this.registration = registration;
    }
 public void displayOrganization() {
        System.out.println("Organization: " + organizationName + ", Budget: ₹" + annualBudget);
        System.out.println("Division: " + division.divisionName + ", Division Budget: ₹" + division.divisionBudget);
        System.out.println("Member: " + member.memberName + ", Contribution: ₹" + member.contribution);
        System.out.println("Registered Year: " + registration.yearOfRegistration);
    }
}

