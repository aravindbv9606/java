public class ForestRunner {
    public static void main(String[] args) {
        Forest forest = new Forest();

        String name = forest.getForestName();
        byte trees = forest.getTreeCount();
        short animals = forest.getAnimalCount();
        int id = forest.getForestId();
        long area = forest.getTotalArea();
        float level = forest.getWaterLevel();
        double fall = forest.getRainfall();
        char zone = forest.getZone();
        boolean protect = forest.getIsProtected();

        System.out.println("Forest Name: " + name);
        System.out.println("Tree Count: " + trees);
        System.out.println("Animal Count: " + animals);
        System.out.println("Forest ID: " + id);
        System.out.println("Total Area: " + area);
        System.out.println("Water Level: " + level);
        System.out.println("Rainfall: " + fall);
        System.out.println("Zone: " + zone);
        System.out.println("Is Protected: " + protect);
    }
}


