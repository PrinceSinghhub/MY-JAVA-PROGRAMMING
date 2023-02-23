package javaprogramming;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int num;
        Scanner codex = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num = codex.nextInt();

        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}


