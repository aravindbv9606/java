class Course {
   public int courseId;
   public String courseTitle;
   public Platform platform;

    public Course(int courseId, String courseTitle, Platform platform) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.platform = platform;
    }

    public void displayCourse() {
        System.out.println("Course: " + courseTitle + ", ID: " + courseId);
		System.out.println(platform.platformName+platform.isLive);
    }
}
