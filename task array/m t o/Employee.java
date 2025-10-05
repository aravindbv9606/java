class Employee extends Company {
    public static void setCompanyName() {
        companyName = "TechNova Inc";
        System.out.println("Company name set to: " + companyName);
	}
		public void displayEmployee(){
		establishedYear=1998;
		 System.out.println("Company nane converted: " + companyName);
        System.out.println("Established Year: " + establishedYear);
		displayCompanyDetails();
    }
}
