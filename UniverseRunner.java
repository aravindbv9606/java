class UniverseRunner {
    public static void main(String[] args) {
        String[] universeObjects = Universe.getUniverseObjects();
        System.out.println("Universe Objects:");
        for (int i = 0; i < universeObjects.length; i++) {
            System.out.println((i + 1) + ". " + universeObjects[i]);
        }
    }
}
