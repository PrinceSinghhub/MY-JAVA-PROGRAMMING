package MathAndNumberSystem;
import java.util.Arrays;

public class OptimalPrimeUnderTheRange {
    public static void main(String[] args) {

        int n = 40;
        boolean[] myarr = new boolean[n+1];
        System.out.println(Arrays.toString(myarr));

        checkPrime(n,myarr);
    }

    static void checkPrime(int n, boolean[] myarr) {
        for (int i = 2; i*i <= n ; i++) {
            if(!myarr[i]) { // myarr[i]!=true}
                for (int j = i*2; j<=n ; j+=i) {
                    myarr[j] = true;

                }
            }

        }
        for (int i = 2; i <= n ; i++) {
            if(!myarr[i]){
                System.out.print(i +" ");

            }

        }
        System.out.println();

        System.out.println(Arrays.toString(myarr));
    }
}
