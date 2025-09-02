class TataCompany {
    public static int employees = 10000;

    public static void companyInfo() {
        System.out.println("Tata Company employees: " + employees);
    }

    TataCompany() {
        System.out.println("No-arg constructor: Tata Company created");
    }

    TataCompany(String companyName, int branches) {
        System.out.println("Company: " + companyName);
        System.out.println("Number of branches: " + branches);
    }

    TataCompany(int branches, String companyName, float annualRevenue) {
        System.out.println("Company: " + companyName);
        System.out.println("Branches: " + branches);
        System.out.println("Annual Revenue (in crores): " + annualRevenue);
    }

    TataCompany(double marketCap, String companyName, float annualRevenue, int branches) {
        System.out.println("Company: " + companyName);
        System.out.println("Branches: " + branches);
        System.out.println("Annual Revenue (in crores): " + annualRevenue);
        System.out.println("Market Cap (in crores): " + marketCap);
    }

    TataCompany(long profit, double marketCap, String companyName, float annualRevenue,int branches){
	System.out.println("Company: " + companyName);
        System.out.println("Branches: " + branches);
        System.out.println("Annual Revenue (in crores): " + annualRevenue);
        System.out.println("Market Cap (in crores): " + marketCap);
        System.out.println("Profit (in crores): " + profit);
    }

    TataCompany(char rating, long profit, double marketCap, String companyName, float annualRevenue, int branches) {
        System.out.println("Company: " + companyName);
        System.out.println("Branches: " + branches);
        System.out.println("Annual Revenue (in crores): " + annualRevenue);
        System.out.println("Market Cap (in crores): " + marketCap);
        System.out.println("Profit (in crores): " + profit);
        System.out.println("Rating: " + rating);
    }

    TataCompany(boolean isListed, char rating, long profit, double marketCap, String companyName, float annualRevenue, int branches) {
        System.out.println("Company: " + companyName);
        System.out.println("Branches: " + branches);
        System.out.println("Annual Revenue (in crores): " + annualRevenue);
        System.out.println("Market Cap (in crores): " + marketCap);
        System.out.println("Profit (in crores):"+profit);
		System.out.println("Rating: " + rating);
        System.out.println("Listed on stock exchange: " + isListed);
    }
}
