class BuildingRunner {   
   public static void main(String[] args) {

        Room[] rooms = new Room[10];
        rooms[0] = new Room(101, false, 1000);
        rooms[1] = new Room(102, true,  1200);
        rooms[2] = new Room(103, false, 1300);
		rooms[3] = new Room(104, false, 1400);
        rooms[4] = new Room(105, true,  1500);
        rooms[5] = new Room(106, false, 1600);
		rooms[6] = new Room(107, false, 1700);
        rooms[7] = new Room(108, true,  1800);
        rooms[8] = new Room(109, false, 1900);
        rooms[9] = new Room(110, false, 2000);
          System.out.println("----------------------");
		Floor[] floors = new Floor[6];
        floors[0] = new Floor(1, rooms);
        floors[1] = new Floor(2, rooms);
		 floors[2] = new Floor(3, rooms);
        floors[3] = new Floor(4, rooms);
		 floors[4] = new Floor(5, rooms);
        floors[5] = new Floor(6, rooms);
  System.out.println("----------------------");
        Building[] buildings = new Building[6];
        buildings[0] = new Building("SkyView", floors);
        buildings[1] = new Building("GreenHeights", floors);
		buildings[2] = new Building("sunRise", floors);
        buildings[3] = new Building("blueOcean", floors);
		buildings[4] = new Building("goldenNest", floors);
        buildings[5] = new Building("silverLine", floors);

        for (Building building : buildings) {
            building.display();
            System.out.println("----------------------");
        }

    }
}
