class CountryPopulations {
    public static void pepels(String total) {
        int amount = 0;
        String name = "";

        if (total=="india"){
            name = "India";
            amount = 200;
        } else if (total=="russia") {
            name = "Russia";
            amount = 300;
        } else if (total=="america") {
            name = "America";
            amount = 32;
        } else if (total=="uk") {
            name = "UK";
            amount = 32;
        } else{
            name = "Australia";
            amount = 41;
        }
        
        System.out.println("Country: " + name);
        System.out.println("Population: " + amount);
		}
		 public static void main(String [] args){
         pepels("India");
		 }
	}
