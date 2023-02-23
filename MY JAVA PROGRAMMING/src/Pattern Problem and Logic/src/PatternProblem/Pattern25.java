package PatternProblem;

public class Pattern25 {
    public static void main(String[] args) {

        /*
          *****
         *   *
        *   *
       *   *
      *****
         */

        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if(i==0){
                    System.out.print("*");
                }
                else if(i==n-1){
                    System.out.print("*");
                }
                else if(j==n-1){
                    System.out.print("*");
                }
                else if(j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
