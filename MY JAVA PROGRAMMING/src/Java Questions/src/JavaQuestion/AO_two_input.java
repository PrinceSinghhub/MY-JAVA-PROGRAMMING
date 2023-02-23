package JavaQuestion;

import java.util.Scanner;

public class AO_two_input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No1: ");
        int n = s.nextInt();
        System.out.print("Enter No2: ");
        int g = s.nextInt();
        operation(n,g);

    }

    static void operation(int n, int g) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your operation\n+ - * /");
        String c =s.next();
        switch (c) {
            case "+" -> {
                int sum = n + g;
                System.out.println("Addition is: " + sum);
            }
            case "-" -> {
                int min = n - g;
                System.out.println("Addition is: " + min);
            }
            case "*" -> {
                int mull = n * g;
                System.out.println("Addition is: " + mull);
            }
            case "/" -> {
                int div = n / g;
                System.out.println("Addition is: " + div);
            }
            default -> System.out.println("Enter Valid Input");
        }
    }


}
