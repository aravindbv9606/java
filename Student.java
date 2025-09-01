class Student {

    public static void printNames(String[] names) {
	 String[] Names = {"Arjun", "Sneha", "Rahul", "Priya", "Ganesh"};
        System.out.println("Student Names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void printScores(double[] scores) {
	 double[] Scores = {89.5, 91.2, 76.4, 88.0, 93.7};
        System.out.println("Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}

class StudentRunner {
    public static void main(String[] args) {
      

        Student.printNames(Names);     
        Student.printScores(Scores);   
    }
}
