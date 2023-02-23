package javaprogramming;

import java.util.Scanner;

public class reverse_int {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();

        int o = a;
        int rev = 0;

        while (a>0){
            rev = (rev*10) + (a%10);
            a=a/10;
        }

        System.out.println("Original Int: " + o);
        System.out.println("Reverse Int: " + rev);
}

}
