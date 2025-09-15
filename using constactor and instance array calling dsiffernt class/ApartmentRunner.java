class ApartmentRunner {
    public static void main(String[] args) {
		
       Floors floors1 = new Floors(2, "Rani");
       Floors floors2 = new Floors(3, "Raja");
	   Floors floors3 = new Floors(4, "Ganang");
       Floors floors4 = new Floors(5, "Manju");
       Floors [] floors ={floors1,floors2,floors3,floors4};
        Apartment apartment = new Apartment();
        apartment.noOfApartment(floors);
    }
}
