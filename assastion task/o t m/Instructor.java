class Instructor {
    int instructorId;
    String instructorName;
    Platform platform;

    public Instructor(int instructorId, String instructorName, Platform platform) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.platform = platform;
    }

    public void displayInstructor(){
	System.out.println(instructorId+instructorName);
	System.out.println(platform.platformName+platform.isLive);
    }
}

