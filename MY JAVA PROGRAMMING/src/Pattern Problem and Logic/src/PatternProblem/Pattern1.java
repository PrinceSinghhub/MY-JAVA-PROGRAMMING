package PatternProblem;

public class Pattern1 {
    public static void main(String[] args) {
        /*
        1.  *****
            *****
            *****
            *****
            *****
         */
        int a = 5;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
