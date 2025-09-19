class Module {
   public int moduleId;
   public String moduleName;
   public Platform platform;

    public Module(int moduleId, String moduleName,  Platform platform) {
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.platform = platform;
    }

    public void displayModule() {
        System.out.println("Module: " + moduleName + moduleId);
		System.out.println(platform.platformName+platform.isLive);
    }
}
