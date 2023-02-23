package PatternProblem;

public class Pattern28 {
    public static void main(String[] args) {

        /*
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

         */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = n-1; i > 0 ; i--) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
//        optimize code
        for (int i = 0; i < 2*n; i++) {
            int totalColsInRow = i>n ? 2*n-i:i;
            int spaces = n-totalColsInRow;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
