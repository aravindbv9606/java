class Building {
    String name;
    Floor[] floors;

    public Building(String name, Floor[] floors) {
        this.name = name;
        this.floors=floors;
}public void display() {
        System.out.println("Building: " + name);
        for (Floor floor : floors) {
            floor.display();
        }
    }
}
