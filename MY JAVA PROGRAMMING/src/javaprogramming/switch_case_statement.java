package javaprogramming;

import java.util.Scanner;

public class switch_case_statement {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);

        int age = p.nextInt();

        switch (age) {
            case 18, 17, 12, 19, 11 -> System.out.println("Hello ji");
            case 15 -> System.out.println("sorry");
            case 10, 5, 3, 1 -> System.out.println("Happy biday");
            default -> System.out.println("tHANKGYOU");
        }

    }
}
