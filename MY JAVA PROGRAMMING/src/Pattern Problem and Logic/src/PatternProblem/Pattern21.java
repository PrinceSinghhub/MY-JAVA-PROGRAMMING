package PatternProblem;

public class Pattern21 {
    public static void main(String[] args) {

        /*
        1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15
         */
        int n = 5;
        int nums = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nums + " ");
                nums++;
            }
            System.out.println();

        }
    }
}
