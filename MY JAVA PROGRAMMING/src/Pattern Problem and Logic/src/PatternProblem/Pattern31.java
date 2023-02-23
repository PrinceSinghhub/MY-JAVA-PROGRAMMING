package PatternProblem;

public class Pattern31 {
    public static void main(String[] args) {

        /*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
         */

        int n = 4;
        int OriginalN = n;
        n = 2*n;
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= n ; j++) {

                int atIndex = OriginalN - Math.min(Math.min(i,j),Math.min(n-i,n-j));

                if (atIndex==0){
                    System.out.print("p ");

                }else {
                    System.out.print(atIndex+" ");
                }
            }
            System.out.println();
            
        }
    }
}
