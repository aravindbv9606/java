class Student {
    int[] rollNumbers = {1, 2, 3};
    String[] names = {"Arun", "Bala", "Chetan"};
    char[] sections = {'A', 'B', 'C'};
    float[] marks = {85.5f, 78.0f, 92.5f};
    boolean[] isPassed = {true, true, true};

    public void displayStudentDetails() {
        for (int details = 0; details < rollNumbers.length; details++) {
            System.out.println("Roll No: " + rollNumbers[details]);
            System.out.println("Name: " + names[details]);
            System.out.println("Section: " + sections[details]);
            System.out.println("Marks: " + marks[details]);
            System.out.println("Passed: " + isPassed[details]);
       
        }
    }
}

