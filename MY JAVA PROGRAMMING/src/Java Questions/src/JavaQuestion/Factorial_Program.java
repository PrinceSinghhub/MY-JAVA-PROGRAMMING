package JavaQuestion;

import java.util.Scanner;

public class Factorial_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = sc.nextInt();
        int r = factorial(n);
        System.out.println("Factorial of " + n + " is: " + r);

    }

    static int factorial(int n) {
        int r = 1;
        while (n>0){
            r*=n;
            n--;
        }
        return r;
    }

}
