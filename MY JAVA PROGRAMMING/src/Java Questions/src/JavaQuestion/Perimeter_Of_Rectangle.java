package JavaQuestion;

import java.util.Scanner;

public class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        P=2(l+w)
        System.out.print("Enter lenth: ");
        float lenth = sc.nextFloat();
        System.out.print("Enter wedith: ");
        float wedith = sc.nextFloat();

        float result = 2*(lenth+wedith);
        System.out.println("P of Rectangle: " + result);
    }
}

