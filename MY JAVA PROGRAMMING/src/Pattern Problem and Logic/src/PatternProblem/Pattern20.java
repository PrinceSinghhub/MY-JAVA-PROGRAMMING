package PatternProblem;

public class Pattern20 {
    public static void main(String[] args) {

        /*
         ****
         *  *
         *  *
         *  *
         ****
         */

        int n = 4;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j <= n-1; j++) {

                if(i==0){
                    System.out.print("*");
                }

                else if(i==n){
                    System.out.print("*");
                }
                else if(j==0){
                    System.out.print("*");
                }

                else if(j==n-1){
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
