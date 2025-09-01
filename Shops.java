class Shops{
public static void main(String [] ref){
	double[] scores = {89.5, 91.2, 76.4, 88.0, 93.7};
 printScores(scores);

}

    public static void printScores(double[] scores) {
        System.out.println("Scores:");
        for (int number = 0; number < scores.length; number++) {
            System.out.println(scores[number]);
     
		}
    }
}