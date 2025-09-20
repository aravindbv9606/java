class InstitutionRunner {
    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment("2022");
        Learner learner = new Learner("Ravi", 30000);
        Course course = new Course("Data Science", 50000);

        Institution institution = new Institution("SkillUp Academy", 55000, course, learner, enrollment);
        institution.displayInstitution();
    }
}
