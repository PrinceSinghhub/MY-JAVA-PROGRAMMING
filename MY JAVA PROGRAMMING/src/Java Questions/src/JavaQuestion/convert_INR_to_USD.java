package JavaQuestion;

import java.util.Scanner;

public class convert_INR_to_USD {
    static float dollar = 0.014f;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter INR: ");
        int n = s.nextInt();
        convert(n);
    }

    static void convert(int n) {
        float usd = dollar*n;
        System.out.println(n + " INR is equal to "+ usd+" USD");

    }
}
