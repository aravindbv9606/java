class Student {
 public int studentId;
 public String studentName;
  public Platform platform;

    public Student(int studentId, String studentName, Platform platform) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.platform = platform;
    }

    public void displayStudent() {
        System.out.println("Student: " + studentName + ", ID: " + studentId);
		System.out.println(platform.platformName+platform.isLive);
    }
}
