class Institution {
   public String institutionName;
    public int institutionFee;
    public Course course;
    public Learner learner;
    public Enrollment enrollment;

    public Institution(String institutionName, int institutionFee, Course course, Learner learner, Enrollment enrollment) {
        this.institutionName = institutionName;
        this.institutionFee = institutionFee;
        this.course = course;
        this.learner = learner;
        this.enrollment = enrollment;
    }

    public void displayInstitution() {
        System.out.println("Institution: " + institutionName + ", Fee: ₹" + institutionFee);
        System.out.println("Course: " + course.courseName + ", Course Fee: ₹" + course.courseFee);
        System.out.println("Learner: " + learner.learnerName + ", Paid: ₹" + learner.feePaid);
        System.out.println("Enrollment Year: " + enrollment.enrollmentYear);
    }
}
