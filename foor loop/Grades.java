class Grades {
  public  char[] grades = {'A', 'B', 'C', 'D', 'E', 'F', 'A', 'B', 'C', 'D'};

  public  void display() {
        for (int rank = 0; rank < grades.length; rank++) {
            System.out.println(grades[rank]);
        }
    }
}

