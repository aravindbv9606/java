class Company {
    int[] employeeIds = {101, 102, 103};
    float[] salaries = {25000.5f, 30000.75f, 28000.0f};
    long[] revenue = {100000000L, 150000000L, 120000000L};
    double[] profit = {123456.78, 234567.89, 345678.90};
    char[] grades = {'A', 'B', 'C'};
    boolean[] isActive = {true, false, true};
    byte[] ratings = {5, 4, 3};
    short[] branches = {2, 3, 4};

    public void displayCompanyDetails() {
        for (int age = 0; age < employeeIds.length; age++) {
			
            System.out.println("Employee ID: " + employeeIds[age]);
		} for (int packege = 0; packege < salaries.length; packege++) {
			
            System.out.println("Salary: " + salaries[packege]);
		}for (int instance = 0; instance < revenue.length; instance++) {
			
             System.out.println("Revenue: " + revenue[instance]);
		}for (int profite = 0; profite < profit.length; profite++) {
			
             System.out.println("profit: " + profit[profite]);
		}for (int grade = 0; grade < grades.length; grade++) {
			
             System.out.println("grades: " + grades[grade]);
		}for (int isActiv = 0; isActiv < isActive.length; isActiv++) {
			
             System.out.println("isActive: " + isActive[isActiv]);
			 
		}for (int rating = 0; rating < ratings.length; rating++) {
			
             System.out.println("ratings: " + ratings[rating]);
			 
		}for (int branche = 0; branche < branches.length; branche++) {
			
             System.out.println("branches: " + branches[branche]);
			 
		}
            
            
          
           
        
    }
}
