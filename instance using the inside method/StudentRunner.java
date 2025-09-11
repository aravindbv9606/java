 class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Percentage: " + student.getPercentage());
        System.out.println("Passed: " + student.isPassed());
    }
}
