class Grades {
    char[] grades = {'A', 'B', 'C', 'D', 'E', 'F', 'A', 'B', 'C', 'D'};

    void display() {
        for (int rank = 0; rank < grades.length; rank++) {
            System.out.println(grades[rank]);
        }
    }
}

