class LearningApp {
    public static void main(String[] args) {
       public Platform platform = new Platform("LearnOnline", true);

        Student student = new Student(101, "Aravind", platform);
        Instructor instructor = new Instructor(201, "Meera", platform);
        Course course = new Course(301, "Java Programming", platform);
        Module module = new Module(401, "OOP Concepts", platform);
        
        Certificate certificate = new Certificate("Java Mastery", platform);

        student.displayStudent();
        instructor.displayInstructor();
        course.displayCourse();
        module.displayModule();
        
		certificate.displayCertificate();
    }
}

