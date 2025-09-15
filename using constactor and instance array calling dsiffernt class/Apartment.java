class Apartment {
    public void noOfApartment(Floors[] floors) {
        for (int num = 0; num < floors.length; num++) {
            floors[num].displayDetails();
            System.out.println("Floor :" + num);
        }
    }
}

