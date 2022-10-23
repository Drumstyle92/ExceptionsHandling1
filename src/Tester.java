/**
 * class that contains the whole program.
 */
public class Tester {
    /**
     *
     * @param score score parameter that indicates the score put by the user.
     * method used to show the various scores entered by the user.
     *
     */
        public static void checkScore ( double score){
            // The various scores
            if (score > 0.0 && score <= 50.0) {
                System.out.println(score + " Average score");
            } else if (score > 50.00 && score <= 100.00) {
                System.out.println(score + " Very good score");
            } else {
                // Calling an exception
                throw new ArithmeticException(score + " Score is out of scale!");
            }
        }

    /**
     *
     * @param args main parameter
     * main method showing the various scores plus the exception.
     */
    public static void main(String[] args) {
        // Scores
        System.out.println("------------------------------");
         checkScore(2.15);
        System.out.println("------------------------------");
         checkScore(50);
        System.out.println("------------------------------");
         checkScore(95.02);
        System.out.println("---------------Exception---------------");
         checkScore(100.01);
    }
}