package javaprogramming;

import java.util.Scanner;

public class check_digit_how_many_times {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        long a = n.nextLong();
        int z = 7;

        int r = 0;
        while(a>0){

            double d = a%10;
            if (d == z){
                r+=1;
            }
            a= a/10;


        }
        System.out.println(r);
    }
}
