package MathAndNumberSystem;

import javax.swing.*;

public class DecimalPerfectSquareRoot {
    public static void main(String[] args) {
         int N = 40;
         int decimalPlace = 3;

         double res = DecimalSquareRoot(N,decimalPlace);
        System.out.printf("%.3f",res);

    }

    static double DecimalSquareRoot(int n, int decimalPlace) {

        double ans = 0.0;
        double increment = 0.1;
        for (int i = 0; i <decimalPlace ; i++) {

            while (ans*ans<=n){
                ans+=increment;
            }
            ans-=increment;
            increment/=10;

        }
        return ans;
    }
}
