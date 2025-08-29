
class ContactBook {
    public static void main(String[] args) {
        
        long arjun = 9876543210L;
        long sneha = 9123456780L;
        long rahul = 9988776655L;
        long priya = 9012345678L;
        long ravi = 9090909090L;

        long[] numbers = {arjun, sneha, rahul, priya, ravi};

        long anesh = 12345678456L;
        numbers[4] = anesh;  
        System.out.println("Updated number at index 4: " + numbers[4]);

        System.out.println("Contact List:");
        for (int phone = 0; phone < numbers.length; phone++) {
            System.out.println(numbers[phone]);
        }

        
        int raja = 98;
        int snehaMarks = 91;
        int rahulMarks = 99;
        int pouri = 86;
        int aaru = 95;

        int[] list = {raja, snehaMarks, rahulMarks, pouri, aaru};

          int gani = 12;
        list[4] = gani; 
        System.out.println( "updated no="+list[4]);
        for (int marks = 0; marks < list.length; marks++) {
            System.out.println(list[marks]);
        }
     
        
	 
         double arun = 98.5;
        double sneh = 91.2;
        double rahi = 99.0;
        double naray = 86.3;
        double aaki = 95.7;

        double[] scores = {arun, sneh, rahi, naray, aaki};
        double ganesh = 92.4;
        scores[4] = ganesh;

        System.out.println("branch rank:");
        for (int branch = 0; branch < scores.length; branch++) {
            System.out.println(scores[branch]);
        }
        float mahi = 45.6f;
        float shanka = 49.2f;
        float manoj = 50.5f;
        float pani = 43.8f;
        float aakash = 47.9f;

        float[] grade = {mahi, shanka, manoj, pani, aakash};

        float alpin = 48.4f;
        grade[4] = alpin;  

        System.out.println("Float Scores List:");
        for (int score = 0; score < grade.length; score++) {
            System.out.println(grade[score]);
        }
    
        String name1 = "Aajay";
        String name2 = "Senha";
        String name3 = "Rale";
        String name4 = "Pooja";
        String name5 = "Arkesh";

        String[] names = {name1, name2, name3, name4, name5};

        String Name = "raju";
        names[4] = Name;  

        System.out.println("Name List:");
        for (int name = 0; name < names.length; name++) {
            System.out.println(names[name]);
        }
        boolean isActive1 = true;
        boolean isActive2 = false;
        boolean isActive3 = true;
        boolean isActive4 = true;
        boolean isActive5 = false;

        boolean[] status = {isActive1, isActive2, isActive3, isActive4, isActive5};

        boolean updatedStatus = true;
        status[4] = updatedStatus;  

        System.out.println("Active Status List:");
        for (int value= 0; value< status.length; value++) {
            System.out.println(status[value]);
        }
        char grade1 = 'A';
        char grade2 = 'B';
        char grade3 = 'C';
        char grade4 = 'D';
        char grade5 = 'E';

        char[] grades = {grade1, grade2, grade3, grade4, grade5};

        char updatedGrade = 'S';
        grades[4] = updatedGrade;  

        System.out.println("Grade List:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

}	
}
