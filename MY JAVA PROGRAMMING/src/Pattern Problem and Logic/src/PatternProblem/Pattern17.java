package PatternProblem;

public class Pattern17 {
    public static void main(String[] args) {

        /*
         1
        212
       32123
      4321234
       32123
        212
         1
         */

        int n = 4;
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j);

            }

            for (int j = 2; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println();


        }


        for (int i = n-1; i > 0; i--) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j);

            }

            for (int j = 2; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println();


        }
        //        optimize code
        for (int i = 0; i < 2*n; i++) {
            int totalColsInRow = i>n ? 2*n-i:i;
            int spaces = n-totalColsInRow;
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int j = totalColsInRow; j > 0; j--) {
                System.out.print(j+" ");
            }

            for (int j = 2; j <= totalColsInRow; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
