package PatternProblem;

public class Pattern6 {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */
//        for upper part
        int n = 5;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//for lower part
        for (int i = n-1; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        optimize code
        for (int i = 0; i < 2*n; i++) {
            int totalColsInRow = i>n ? 2*n-i:i;
            System.out.println(totalColsInRow);
            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
